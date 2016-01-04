package si.auto;

public abstract class Car implements Vehicle {
	protected int fuelTankSize;
	protected double fuelConsumedPer100Km;
	protected double pollutionPerKm;
	protected double currentFuelAmount;
	protected final String chassisNumber;

	public enum fuelType {
		PETROL, DIESEL, HYBRID, ELECTRIC
	}

	private double distance;
	private double fuelConsumed;

	public Car(float currentFuelAmount, String chassisNumber) {
		this.currentFuelAmount = currentFuelAmount;
		this.chassisNumber = chassisNumber;
	}

	

	public double getCurrentFuelAmount() {
		return currentFuelAmount;
	}

	public void setCurrentFuelAmount(double currentFuelAmount) {
		this.currentFuelAmount = currentFuelAmount;
	}

	public void start() {

		if (currentFuelAmount == 0) {
			System.out.println("No Fuel,No Start");
			setPollution(0);
			setFuelConsumed(0);
		}
	}

	public void stop() {
		System.out.println("Car Stopped");

	}

	public void drive(float distance) {
		this.distance = distance;
		System.out.println("you drove " + distance);

	}

	public void shiftGear(int gear) {
	}

	public void setPollution(double pol) {
		pollutionPerKm = pol;
	}

	public double getPollution() {
		return pollutionPerKm;
	}

	public double getAvailableFuel() {
		double x = distance * fuelConsumedPer100Km / 100;
		setCurrentFuelAmount(currentFuelAmount - x);
		return currentFuelAmount;
	}

	public double totalPolution() {
		double pollution = distance * getPollution();
		return pollution;
	}

	public double getFuelConsumed() {
		return fuelConsumed;
	}

	public void setFuelConsumed(double fuelConsumed) {
		this.fuelConsumed = fuelConsumed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassisNumber == null) ? 0 : chassisNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(currentFuelAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(distance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fuelConsumed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fuelConsumedPer100Km);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + fuelTankSize;
		temp = Double.doubleToLongBits(pollutionPerKm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(currentFuelAmount) != Double.doubleToLongBits(other.currentFuelAmount))
			return false;
		if (Double.doubleToLongBits(distance) != Double.doubleToLongBits(other.distance))
			return false;
		if (Double.doubleToLongBits(fuelConsumed) != Double.doubleToLongBits(other.fuelConsumed))
			return false;
		if (Double.doubleToLongBits(fuelConsumedPer100Km) != Double.doubleToLongBits(other.fuelConsumedPer100Km))
			return false;
		if (fuelTankSize != other.fuelTankSize)
			return false;
		if (Double.doubleToLongBits(pollutionPerKm) != Double.doubleToLongBits(other.pollutionPerKm))
			return false;
		return true;
	}
}
