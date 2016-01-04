package si.auto;

public class VWGolf extends VW {
	private static final int FUEL_TANK_SIZE = 55;
	public VWGolf(int currentFuelAmount,String chassisNumber){
		super(currentFuelAmount,chassisNumber);
	final double pollutionPerKm =0.05;
	}
	public void shiftGear(int gear){
		switch (gear){
		case 1 : fuelConsumedPer100Km = 8.1;
		break;
		case 2 : fuelConsumedPer100Km = 7.3;
		break;
		case 3 : fuelConsumedPer100Km = 6.1;
		break;
		case 4 : fuelConsumedPer100Km = 5.3;
		break;
		case 5 : fuelConsumedPer100Km = 4.2;
		break;
		case 6 : fuelConsumedPer100Km = 3.7;
		break;
		default : System.out.println("You try to shift a gear that doesn't exist");
			}
	}	
	public double getPollution() {
		return 2;
	}
}
	
	
	
	
