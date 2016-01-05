package si.auto;

/**
 * Abstract class that implements interface Vehicle used to model a car
 * 
 * @author alex
 *
 */
public abstract class Car implements Vehicle {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassisNumber == null) ? 0 : chassisNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (chassisNumber == null) {
			if (other.chassisNumber != null)
				return false;
		} else if (!chassisNumber.equals(other.chassisNumber))
			return false;
		return true;
	}

	protected int fuelTankSize;
	protected double fuelConsumedPer100Km;
	protected double pollutionPerKm;
	protected double currentFuelAmount;
	protected final String chassisNumber;
	private double totalPollution;
	private double distance;
	private double fuelConsumed;
	private double totalDistance;
	private double totalFuelConsumed;
	private double averageFuelConsumption;
	protected int gear;
	private boolean result;

	/**
	 * Car constructor
	 * 
	 * @param currentFuelAmount
	 * @param currentFuelAmount
	 */
	public Car(float currentFuelAmount, String chassisNumber) {
		this.currentFuelAmount = currentFuelAmount;
		this.chassisNumber = chassisNumber;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	private void setFuelConsumed(double fuelConsumed) {
		this.fuelConsumed = fuelConsumed;
	}

	private void setPollution(double pol) {
		totalPollution = pol;
	}

	/**
	 * start ()method implemented from the interface
	 * 
	 * @return true if car started.
	 */
	public boolean start() {

		if (currentFuelAmount != 0) {
			System.out.println("Car start");
			result = true;

		} else
			throw new NullPointerException("NO gas");
		setPollution(0);
		setFuelConsumed(0);
		setTotalDistance(0);
		if (gear > 1) {
			result = false;
			throw new IllegalArgumentException("you can't start the car in that gear");
		}
		return result;
	}

	private void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

	/**
	 * stop ()method implemented from the interface
	 * 
	 * @return false if car stopped.
	 */
	public boolean stop() {
		if (result == true) {
			System.out.println("Car Stopped");
			System.out.println("You drove " + totalDistance + "km");
			result = false;
		} else {
			throw new IllegalArgumentException("car already stopped");
		}

		return result;
	}

	/**
	 * drive ()method implemented from the interface
	 * 
	 * @param distance
	 * @param fuelConsumed
	 * @param currentFuelAmount
	 *            * @param totalFuelConsumed
	 * @param totalPollution
	 * @param totalDistance
	 */
	public void drive(float distance) {
		this.distance = distance;
		if (result == false) {
			throw new IllegalArgumentException("can't drive if you haven't started the car");
		}
		if (distance == 0) {
			throw new IllegalArgumentException("you have stopped");
		}
		totalDistance = totalDistance + distance;
		System.out.println("you drove " + distance + "km");
		fuelConsumed = distance * fuelConsumedPer100Km / 100;
		totalFuelConsumed = totalFuelConsumed + fuelConsumed;
		currentFuelAmount = currentFuelAmount - fuelConsumed;
		if (currentFuelAmount < 0) {
			throw new IllegalArgumentException("No more gas");
		}
		totalPollution = totalDistance * getPollutionPerKm();

	}

	/**
	 * abstract method shiftGear without body
	 * 
	 * @param gear
	 */
	public abstract void shiftGear(int gear);

	public double getPollutionPerKm() {
		return pollutionPerKm;
	}

	public double getPollution() {
		System.out.println("pollution is " + totalPollution);
		return totalPollution;
	}

	public double getAvailableFuel() {
		return currentFuelAmount;
	}

	public double getDistance() {
		return distance;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public double getTotalFuelConsumed() {
		return totalFuelConsumed;
	}

	/**
	 * getFuelAverageConsumption() method
	 * 
	 * @param averageFuelConsumption
	 * @param totalFuelConsumed
	 * @param totalDistance
	 * @return averageFuelConsumption
	 */
	public double getFuelAverageConsumption() {
		averageFuelConsumption = totalFuelConsumed / totalDistance * 100;
		if (totalFuelConsumed == 0 || totalDistance == 0) {
			throw new NullPointerException("Car hasn't moved");
		}
		System.out.println("average fuel consumption is " + averageFuelConsumption + " l/100km");
		return averageFuelConsumption;
	}
}