package si.auto;

import java.util.*;

public class CarWash {

	public List<Car> carsInLine = new ArrayList<>();
	public Set<Car> carsWashed = new LinkedHashSet<Car>(carsInLine);

	public void openShop() {

	}

	public void standInLine(Car car) {
		carsInLine.add(car);

	}

	public void washCar() {
		carsWashed.add(carsInLine.get(0));
		carsInLine.remove(0);

	}

	public void closeShop() {
		if (carsInLine.size() != 0) {
			for (Car car : carsInLine) {
				System.out.println("Unwashed car" + car);
			}

		}
	}

	public void printClients() {
		Iterator<Car> iter = carsWashed.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
