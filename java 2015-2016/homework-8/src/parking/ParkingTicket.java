package parking;

import si.auto.Vehicle;

public class ParkingTicket {
	ParkingSlot slot;
	double uniqueNr;
	Vehicle vehicle;

	/**
	 * ParkingTicket constructor
	 * 
	 * @param ParkingSlot
	 *            slot
	 * @param Vehicle
	 *            vehicle
	 * 
	 */
	public ParkingTicket(ParkingSlot slot, Vehicle vehicle) {
		this.slot = slot;
		this.vehicle = vehicle;
		uniqueNr = slot.hashCode() * 13 + vehicle.hashCode() * 79;
	}

	public ParkingSlot getSlot() {
		return slot;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public double getUniqueNr() {
		return uniqueNr;
	}

}
