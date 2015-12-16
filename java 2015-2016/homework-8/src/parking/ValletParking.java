package parking;

import si.auto.*;

public class ValletParking<T extends Vehicle> {
	T t;
	double amountOfFuelBeforeParking;
	double amountOfFuelAfterParking;
	private ParkingTicket ticket;
	private ParkingLot parkLot = new ParkingLot();

	public ParkingTicket parkVehicle(T t) {
		this.t = t;
		amountOfFuelBeforeParking = t.getAvailableFuel();
		t.start();
		t.drive(2);
		t.stop();
		ticket = new ParkingTicket(parkLot.findFirstAvailableSpot(),t);
		return ticket;
	}

	public Vehicle retrieveVehicle(ParkingTicket ticket) {
		ticket.getSlot();
		t.start();
		t.drive(2);
		t.stop();
		amountOfFuelAfterParking = t.getAvailableFuel();
		return t;
	}

}
