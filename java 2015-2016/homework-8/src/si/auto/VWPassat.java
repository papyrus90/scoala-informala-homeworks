package si.auto;

/**
 * Class VWPassat extends from VW
 */
public class VWPassat extends VW {
	private static final int FUEL_TANK_SIZE = 65;
	private int i = 0;

	public VWPassat(int currentFuelAmount, String chassisNumber) {
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
			fuelConsumedPer100Km = 8.5;
			break;
		case 2:
			fuelConsumedPer100Km = 7.8;
			break;
		case 3:
			fuelConsumedPer100Km = 6.6;
			break;
		case 4:
			fuelConsumedPer100Km = 5.7;
			break;
		case 5:
			fuelConsumedPer100Km = 4.5;
			break;
		case 6:
			fuelConsumedPer100Km = 3.9;
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
		return 0.3;
	}

	public static int getFuelTankSize() {
		return FUEL_TANK_SIZE;
	}
}
