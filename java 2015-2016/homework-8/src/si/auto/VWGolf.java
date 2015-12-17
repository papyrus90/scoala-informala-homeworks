package si.auto;

/**
 * Class VWGolf extends from VW
 */
public class VWGolf extends VW {
	private static final int FUEL_TANK_SIZE = 55;
	private int i = 0;
	
	public VWGolf(int currentFuelAmount, String chassisNumber) {
		super(currentFuelAmount, chassisNumber);
		if (currentFuelAmount > FUEL_TANK_SIZE) {
			throw new IllegalArgumentException("Too much gas");
		}
	}

	/**
	 * shiftGear method that now sets fuelConsumedPer100Km
	 * 
	 * @param gear
	 * @param fuelConsumedPer100Km
	 */
	public void shiftGear(int gear) {
		this.gear = gear;
		switch (gear) {
		case 1:
			fuelConsumedPer100Km = 8.1;
			break;
		case 2:
			fuelConsumedPer100Km = 7.3;
			break;
		case 3:
			fuelConsumedPer100Km = 6.1;
			break;
		case 4:
			fuelConsumedPer100Km = 5.3;
			break;
		case 5:
			fuelConsumedPer100Km = 4.2;
			break;
		case 6:
			fuelConsumedPer100Km = 3.7;
			break;
		default:
			throw new IllegalArgumentException("not a gear");
		}
		if (gear - i > 1) {
			throw new IllegalArgumentException("can t switch to that");

		}
		i = gear;
	}

	public double getPollutionPerKm() {
		return 0.2;
	}

	public static int getFuelTankSize() {
		return FUEL_TANK_SIZE;
	}
}
