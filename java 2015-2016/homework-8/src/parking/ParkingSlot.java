package parking;

public class ParkingSlot {
	int slotNumber;
	int floor;
	boolean isOccupied;

	public ParkingSlot(int floor ,int slotNumber) {
		this.slotNumber = slotNumber;
		this.floor = floor;
		
	}

	public void occupy() {
		isOccupied = true;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

}
