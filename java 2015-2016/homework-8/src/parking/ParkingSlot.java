package parking;

public class ParkingSlot {
	int slotNumber;
	boolean isOccupied;

	/**
	 * ParkingSlot constructor
	 * 
	 * @param slotNumber
	 */
	public ParkingSlot(int slotNumber) {
		this.slotNumber = slotNumber;

	}

	/**
	 * method occupy() that changes the boolean variable isOccupied from true to
	 * false
	 */
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
