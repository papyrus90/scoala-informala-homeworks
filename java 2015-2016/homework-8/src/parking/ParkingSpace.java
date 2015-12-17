package parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpace {

	private ParkingSlot slot;
	private List<ParkingSlot> spots;

	/**
	 * ParkingSpace constructor that also calls the method filSpace() and
	 * initializes the ArrayList spots
	 */
	public ParkingSpace() {
		spots = new ArrayList<>(100);
		fillSpace();
	}

	/**
	 * method that fills the ArrayList with ParkingSlot instances.
	 */
	public void fillSpace() {
		for (int i = 0; i < 100; i++) {
			spots.add(new ParkingSlot(i));
		}
	}

	public boolean isFull() {
		for (ParkingSlot slot : spots) {
			if (!slot.isOccupied) {
				return false;
			}

		}
		return true;
	}

	/**
	 * method that finds the first available spot
	 * 
	 * @return ParkingSlot
	 */
	public ParkingSlot findAvailableSlot() {
		if (isFull()) {
			throw new IllegalArgumentException("No more space in the parking lot!!");
		}
		for (ParkingSlot spot : spots) {
			if (spot.isOccupied() == false) {
				slot = spot;
				slot.occupy();
				break;

			}

		}
		return slot;
	}

}
