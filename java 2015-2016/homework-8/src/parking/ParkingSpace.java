package parking;

import java.util.ArrayList;
import java.util.List;




public class ParkingSpace {

	private ParkingSlot slot;
	private List<ParkingSlot> spots;

	public ParkingSpace() {
		spots = new ArrayList<>(100);
		fillSpace();
	}

	public void fillSpace() {
		for (int i = 0; i < 100; i++) {
			spots.add(new ParkingSlot(i));
		}
	}

	public ParkingSlot findAvailableSlot() {
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
