package si.auto;

/**
 * Interface used to model Vehicles.
 */
public interface Vehicle {
	boolean start();

	boolean stop();

	void drive(float distance);

	double getAvailableFuel();
	
	
}
