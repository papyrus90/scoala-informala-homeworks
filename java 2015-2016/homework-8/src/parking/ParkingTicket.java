package parking;


import si.auto.Vehicle;

public class ParkingTicket {
	ParkingSlot slot;
	Vehicle vehicle;
	
	public ParkingTicket(ParkingSlot slot,Vehicle vehicle){
		this.slot = slot;
		this.vehicle = vehicle;
	}

	public ParkingSlot getSlot() {
		return slot;
	}


	
}
