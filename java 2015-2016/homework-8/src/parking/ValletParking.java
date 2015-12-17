package parking;

import java.util.HashMap;
import java.util.Map;

import si.auto.*;

/**
 * Generic class ValletParking,with a parameter T that extends Vehicle
 * 
 * @author alex
 */
public class ValletParking<T extends Vehicle> {
	private ParkingSpace parkSpace = new ParkingSpace();
	private Map<Double, T> valletParking;
	private double number;
	private ParkingTicket ticket;

	/**
	 * ValletParking constructor that initializes the Map valletParking
	 */
	public ValletParking() {
		valletParking = new HashMap<Double, T>();
	}

	/**
	 * generic method parkVehcile,with a parameter E that extends the type T
	 * 
	 * @return ParkingTicket ticket
	 */
	public <E extends T> ParkingTicket parkVehicle(E t) {
		ParkingSlot slot;
		slot = parkSpace.findAvailableSlot();
		t.start();
		t.shiftGear(1);
		t.drive(2 + slot.slotNumber);
		t.stop();
		ticket = new ParkingTicket(slot, t);
		number = ticket.getUniqueNr();
		valletParking.put(number, t);
		return ticket;
	}

	/**
	 * method retrieveVehcile,with a parameter E that extends T
	 * 
	 * @return ParkingTicket ticket
	 */
	public T retrieveVehicle(ParkingTicket ticket) {
		T retrieved = valletParking.get(ticket.getUniqueNr());
		retrieved.start();
		retrieved.shiftGear(1);
		retrieved.drive(2 + (ticket.getSlot().getSlotNumber()));
		retrieved.stop();
		ticket.slot.isOccupied = false;
		valletParking.remove(ticket.uniqueNr);
		return retrieved;
	}

}
