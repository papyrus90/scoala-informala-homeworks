package si.user;

import parking.ParkingTicket;
import parking.ValletParking;
import si.auto.Car;
import si.auto.Logan;

public class Main {

	public static void main(String[] args) {

		Car logan = new Logan(35, "alex");
		logan.shiftGear(1);
		logan.start();
		logan.drive(10);
		logan.shiftGear(2);
		logan.drive(4);
		logan.shiftGear(3);
		logan.drive(15);
		logan.shiftGear(4);
		logan.drive(25);
		logan.shiftGear(5);
		logan.drive(44);
		logan.stop();

		logan.getFuelAverageConsumption();
		logan.getAvailableFuel();
		logan.getPollution();

		ValletParking<Car> carPark = new ValletParking<Car>();
		Car logan1 = new Logan(23, "safac");
		Car logan2 = new Logan(21, "gacax");
		ParkingTicket ticket1 = carPark.parkVehicle(logan1);
		carPark.retrieveVehicle(ticket1);
		ParkingTicket ticket2 = carPark.parkVehicle(logan2);
		carPark.retrieveVehicle(ticket2);
	}

}