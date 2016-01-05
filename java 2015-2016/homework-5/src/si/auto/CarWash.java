package si.auto;

import java.util.*;

public class CarWash {

	public List<Car> carsInLine = new ArrayList<>();
	public Set<Car> carsWashed = new LinkedHashSet<Car>(carsInLine);
	public List<Car> unWashedCars = new ArrayList<>();

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
				unWashedCars.add(car);
			}

		}
	}
	
	public List<Car> getPostponedClients(){
		return unWashedCars;
	}
	
	public List<Car>getTodaysClients(){
		List<Car>todaysClients = new ArrayList<>();
		todaysClients.addAll(carsWashed);
		return todaysClients;
	}

	public void printClients() {
		Iterator<Car> iter = carsWashed.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
