package si.test;



import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;


import si.auto.Car;
import si.auto.Logan;
public class CarTest {
	
	Car car;
	@Before
	public void setup(){
		 car = new Logan(33, "admasmca");
		}
	
	@Test
	public void checkCarsDifferntChassis(){
		Car logan = new Logan(12,"sandnasda");
		boolean b = (car.getChassisNumber()==logan.getChassisNumber());
		Assert.assertFalse(b);
	}
	
	@Test(expected = NullPointerException.class)
	public void checkStartWithoutGas(){
		Car logan = new Logan(0,"sandnasda");
		logan.start();
		}
	@Test
	public void checkStartWithGas(){
		
		Assert.assertTrue(car.start());
		}
	@Test(expected = IllegalArgumentException.class)
	public void checkStartInBadShiftGear(){
		car.shiftGear(1);
		car.drive(10);
		car.shiftGear(2);
		car.start();
	}
	@Test
	public void checkStartInProperShiftGear(){
		car.shiftGear(1);
		car.start();
		car.drive(10);
		Assert.assertTrue(car.start());
		}
	@Test(expected = IllegalArgumentException.class)
	public void checkDriveIfCarIsNotStarted(){
		car.shiftGear(1);
		car.drive(22);
	}
	@Test(expected = IllegalArgumentException.class)
	public void checkCarDriveWhenRemainsOutOfGas(){
		car.shiftGear(1);
		car.start();
		car.drive(200);
		car.shiftGear(2);
		car.drive(700);
	}
	@Test
	public void checkCarDriveInIdealCircumstances(){
		car.shiftGear(1);
		car.start();
		car.drive(10);
		car.shiftGear(2);
		car.drive(20);
		car.stop();
		boolean b =(30==car.getTotalDistance());
		Assert.assertTrue(b);
	}
	@Test(expected = IllegalArgumentException.class)
	public void checkCarSwitchNonExistingGear(){
		car.shiftGear(13);
	}
	@Test(expected = IllegalArgumentException.class)
	public void checkCarSwitchToImproperGear(){
		car.shiftGear(1);
		car.start();
		car.drive(10);
		car.shiftGear(5);
		car.drive(22);
	}
	
	@Test
	public void checkCarSwitchInProperConditions(){
		car.shiftGear(1);
		car.start();
		car.drive(11);
		car.shiftGear(2);
		car.drive(12);
		car.shiftGear(3);
		car.drive(33);
		car.stop();
		boolean b =(56==car.getTotalDistance());
		Assert.assertTrue(b);
		}
	@Test(expected = IllegalArgumentException.class)
	public void checkCarStopIfCarHaveNotStarted(){
		car.stop();
		}
	@Test
	public void checkCarStopWithCarStart(){
		car.shiftGear(1);
		car.start();
		car.drive(11);
		Assert.assertFalse(car.stop());
	}
	@Test 
	public void checkGetFuelAverageConsumption(){
		car.shiftGear(1);
		car.start();
		car.drive(10);
		car.shiftGear(2);
		car.drive(22);
		car.stop();
	 	double fuelAverageConsumption = car.getFuelAverageConsumption();
	 	double c =car.getTotalFuelConsumed()/car.getTotalDistance()*100;
	 	boolean b =(fuelAverageConsumption == c);
	 	Assert.assertTrue(b);
	}
	@Test 
	public void checkTotalPollution(){
		car.shiftGear(1);
		car.start();
		car.drive(10);
		car.shiftGear(2);
		car.drive(22);
		car.stop();
		double totalPollution = car.getPollution();
		double c = car.getTotalDistance()*car.getPollutionPerKm();
		boolean b =(totalPollution == c);
		Assert.assertTrue(b);
	}

	
	


}

