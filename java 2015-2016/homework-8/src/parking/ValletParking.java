package parking;

import java.util.HashMap;
import java.util.Map;

import si.auto.*;

public class ValletParking<T extends Vehicle> {
	T t;
	private ParkingSpace parkSpace = new ParkingSpace();
	private Map<Double, Vehicle> valletParking;
	private double number;
	private ParkingTicket ticket;
	double amountOfFuelBeforeParking;
	double amountOfFuelAferParking;

	public ValletParking() {
		valletParking = new HashMap<Double, Vehicle>();
	}

	public ParkingTicket parkVehicle(T t) {
		this.t = t;
		ParkingSlot slot;
		amountOfFuelBeforeParking = t.getAvailableFuel();
		slot = parkSpace.findAvailableSlot();
		t.start();
		t.drive(2 + slot.slotNumber);
		t.stop();
		ticket = new ParkingTicket(slot, t);
		number = ticket.uniqueNr;
		valletParking.put(number, t);
		return ticket;
	}

	public Vehicle RetrieveVehicle(ParkingTicket ticket) {
		Vehicle retrieved = valletParking.get(ticket.uniqueNr);
		retrieved.start();
		retrieved.drive(2 + (ticket.getSlot().getSlotNumber()));
		retrieved.stop();

		ticket.slot.isOccupied = false;
		valletParking.remove(ticket.uniqueNr);

		amountOfFuelAferParking = retrieved.getAvailableFuel();
		return retrieved;
	}

}
