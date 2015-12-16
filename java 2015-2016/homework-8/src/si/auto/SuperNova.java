package si.auto;

/**
 * Class SuperNova extends from Dacia.
 */
public class SuperNova extends Dacia {
	private static final int FUEL_TANK_SIZE = 45;

	public SuperNova(int currentFuelAmount, String chassisNumber) {
		super(currentFuelAmount, chassisNumber);
		if (currentFuelAmount > FUEL_TANK_SIZE) {
			throw new IllegalArgumentException("Too much gas");
		}
	}

	int[] gear = { 1, 2, 3, 4, 5, 6 };

	/**
	 * shiftGear method that now sets fuelConsumedPer100Km
	 * 
	 * @param gear
	 * @param fuelConsumedPer100Km
	 */
	public void shiftGear(int gear) {
		if (gear == 1) {
			fuelConsumedPer100Km = 9.9;
		}
		if (gear == 2) {
			fuelConsumedPer100Km = 8.9;
		}
		if (gear == 3) {
			fuelConsumedPer100Km = 7.9;
		}
		if (gear == 4) {
			fuelConsumedPer100Km = 6.9;
		}
		if (gear == 5) {
			fuelConsumedPer100Km = 5.9;
		}
		if (gear == 6) {
			fuelConsumedPer100Km = 4.9;
			if (gear == 0 || gear > 7) {
				throw new IllegalArgumentException("not a gear");
			}
		}
	}

	public double getPollutionPerKm() {
		return 0.7;
	}

	public static int getFuelTankSize() {
		return FUEL_TANK_SIZE;
	}

}