package parkingaa;
// TODO CODE REVIEW: you should be using the same package as the classes you are testing. Also the test source folder should not have an uppercase name.
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import parking.ParkingSlot;
import parking.ParkingSpace;
import parking.ParkingTicket;
import parking.ValletParking;
import si.auto.Car;
import si.auto.Logan;
import si.auto.Scooter;

public class ParkingTest {
	Car logan;
	Car logan1;
	ValletParking<Car> carPark;
	ParkingTicket ticket1;
	ParkingTicket ticket2;
	Car car;

	@Before
	public void setup() {
		logan = new Logan(22, "alex");
		logan1 = new Logan(33, "sdmam");
		carPark = new ValletParking<>();
	}

	@Test
	public void checkCarIsParkedAndSlotOccupied() {
		ticket1 = carPark.parkVehicle(logan);
		ParkingSlot slot = ticket1.getSlot();
		boolean b = slot.isOccupied();
		Assert.assertTrue(b);
	}

	@Test
	public void checkDifferentParkingSlotsForDifferentCars() {
		ticket1 = carPark.parkVehicle(logan);
		ticket2 = carPark.parkVehicle(logan1);
		ParkingSlot slot = ticket1.getSlot();
		ParkingSlot slot1 = ticket2.getSlot();
		Assert.assertNotEquals(slot, slot1);
	}

	@Test
	public void checkSameCarBeforeAndAfterTheParking() {
		ticket1 = carPark.parkVehicle(logan);
		Car c = carPark.retrieveVehicle(ticket1);
		Assert.assertEquals(logan, c);

	}

	@Test
	public void checkIfACarIsParkedWhereAnotherOneHasLeft() {
		ticket1 = carPark.parkVehicle(logan);
		ParkingSlot slot = ticket1.getSlot();
		carPark.retrieveVehicle(ticket1);
		ticket2 = carPark.parkVehicle(logan1);
		ParkingSlot slot1 = ticket2.getSlot();
		Assert.assertEquals(slot, slot1);
	}

	@Test
	public void checkIfFuelAvailableIsDifferent() {
		double amountOfFuelBeforeParking = logan.getAvailableFuel();
		carPark.parkVehicle(logan);
		double amountOfFuelAfterParking = logan.getAvailableFuel();
		Assert.assertNotEquals(amountOfFuelBeforeParking, amountOfFuelAfterParking, 0);

	}

	@Test
	public void checkIfFuelAfterParkingIsLowerThanBeforeParking() {
		double amountOfFuelBeforeParking = logan.getAvailableFuel();
		ticket1 = carPark.parkVehicle(logan);
		logan = carPark.retrieveVehicle(ticket1);
		double amountOfFuelAfterParking = logan.getAvailableFuel();
		boolean b = (amountOfFuelBeforeParking > amountOfFuelAfterParking);
		Assert.assertTrue(b);
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkParkingWhenParkSpaceIsFull() {
		ParkingSpace mockParkingSpace = new ParkingSpace() {
			@Override
			public boolean isFull() {
				return true;
			}
		};
		mockParkingSpace.findAvailableSlot();
	}

	@Test
	public void checkIfIcanParkAScooter() {
		ValletParking<Scooter> parkScooter = new ValletParking<>();
		Scooter scooter = new Scooter(10);
		ticket1 = parkScooter.parkVehicle(scooter);
		ParkingSlot slot = ticket1.getSlot();
		boolean b = slot.isOccupied();
		Assert.assertTrue(b);

	}

	@Test
	public void checkIfScooterParkedIsTheSameAsScooterRetrieved() {
		ValletParking<Scooter> parkScooter = new ValletParking<>();
		Scooter scooter = new Scooter(10);
		ticket1 = parkScooter.parkVehicle(scooter);
		Scooter scooter1 = parkScooter.retrieveVehicle(ticket1);
		Assert.assertEquals(scooter, scooter1);

	}
}