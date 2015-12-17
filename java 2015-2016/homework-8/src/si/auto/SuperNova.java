package si.auto;

/**
 * Class SuperNova extends from Dacia.
 */
public class SuperNova extends Dacia {
	private static final int FUEL_TANK_SIZE = 45;
	private int i = 0;

	public SuperNova(int currentFuelAmount, String chassisNumber) {
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
			fuelConsumedPer100Km = 9.9;
			break;
		case 2:
			fuelConsumedPer100Km = 8.9;
			break;
		case 3:
			fuelConsumedPer100Km = 7.9;
			break;
		case 4:
			fuelConsumedPer100Km = 6.9;
			break;
		case 5:
			fuelConsumedPer100Km = 5.9;
			break;
		case 6:
			fuelConsumedPer100Km = 4.9;
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
		return 0.7;
	}

	public static int getFuelTankSize() {
		return FUEL_TANK_SIZE;
	}

}