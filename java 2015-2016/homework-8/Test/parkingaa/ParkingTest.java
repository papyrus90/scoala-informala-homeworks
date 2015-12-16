package parkingaa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import parking.ParkingSlot;
import parking.ParkingSpace;
import parking.ParkingTicket;
import parking.ValletParking;
import si.auto.Car;
import si.auto.Logan;
import si.auto.Vehicle;

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
		Car c = (Car) carPark.RetrieveVehicle(ticket1);
		Assert.assertEquals(logan, c);

	}

	@Test
	public void checkIfACarIsParkedWhereAnotherOneHasLeft() {
		ticket1 = carPark.parkVehicle(logan);
		ParkingSlot slot = ticket1.getSlot();
		carPark.RetrieveVehicle(ticket1);
		ticket2 = carPark.parkVehicle(logan1);
		ParkingSlot slot1 = ticket2.getSlot();
		Assert.assertEquals(slot, slot1);
	}

}