package parking;

public class ParkingSlot {
	int slotNumber;
	boolean isOccupied;

	public ParkingSlot(int slotNumber) {
		this.slotNumber = slotNumber;

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
