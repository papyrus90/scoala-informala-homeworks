package si.auto;

import java.util.*;

public class CarInventory {

	Map<String, Car> carMap;
	List<Car> cars;

	public CarInventory() {
		carMap = new HashMap<>();
	}

	public void addCar(Car car) {
		carMap.put(car.chassisNumber, car);
	}

	public Car findCar(String chassisNumber) {
		Car vehicle = carMap.get(chassisNumber);
		if (carMap.get(chassisNumber) == null)
			throw new NullPointerException("That car doesn't exist");
		return vehicle;
	}

	public void removeCar(String chassisNumber) {
		carMap.remove(chassisNumber);
		if (carMap.get(chassisNumber) == null)
			throw new NullPointerException("That car doesn't exist");
	}

	
}
