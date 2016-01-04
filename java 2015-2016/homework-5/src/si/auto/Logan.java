package si.auto;

public class Logan extends Dacia {
	private static final int FUEL_TANK_SIZE = 60;
	public Logan(float currentFuelAmount,String chassisNumber){
		super(currentFuelAmount,chassisNumber);
}
	public void shiftGear(int gear){
	switch (gear){
	case 1 : fuelConsumedPer100Km = 9.1;
	break;
	case 2 : fuelConsumedPer100Km = 7.3;
	break;
	case 3 : fuelConsumedPer100Km = 6.4;
	break;
	case 4 : fuelConsumedPer100Km = 5.1;
	break;
	case 5 : fuelConsumedPer100Km = 4.8;
	break;
	case 6 : fuelConsumedPer100Km = 4.4;
	break;
	default : System.out.println("You try to shift a gear that doesn't exist");
		}

	}
	
	public double getPollution() {
		return 5;
	}
}