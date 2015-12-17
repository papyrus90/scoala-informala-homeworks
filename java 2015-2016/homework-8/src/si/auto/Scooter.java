package si.auto;

public class Scooter implements Vehicle {

	boolean result;
	float distance;
	double availableFuel;

	public Scooter(double fuel) {
		this.availableFuel = fuel;
	}

	@Override
	public boolean start() {
		result = true;
		return result;
	}

	@Override
	public boolean stop() {
		result = false;
		return result;
	}

	@Override
	public void drive(float distance) {
		this.distance = distance;

	}

	@Override
	public double getAvailableFuel() {
		return availableFuel;
	}

	@Override
	public void shiftGear(int gear) {
		gear = 1;

	}

}
