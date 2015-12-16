package parking;



public class ParkingLot {

	private ParkingSlot[][] parkingSpaces;
	private ParkingSlot slot;


	public ParkingLot() {
		parkingSpaces = new ParkingSlot[10][10];
		createSlots();
	}

	public void createSlots() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (parkingSpaces[i][j] == null) {
					ParkingSlot slot = new ParkingSlot(i, j);
					parkingSpaces[i][j] = slot;
				}
			}
		}
	}

	public ParkingSlot findFirstAvailableSpot() {
		for (ParkingSlot[] slots : parkingSpaces) {
			for (ParkingSlot slotIterator : slots) {
				if (slotIterator.isOccupied() == false) {
					slotIterator.occupy();
					slot = slotIterator;
					break;
				}
			
			}
			if (slot.isOccupied == true) {
				break;
			}
		}
		return slot;
	}

}
