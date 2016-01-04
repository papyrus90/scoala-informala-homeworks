package si.auto;

public class VWPassat extends VW {
	private static final int FUEL_TANK_SIZE = 65;
	public VWPassat(int currentFuelAmount,String chassisNumber){
		super(currentFuelAmount,chassisNumber);
	final double pollutionPerKm =0.07;	
}
	public void shiftGear(int gear){
		switch (gear){
		case 1 : fuelConsumedPer100Km = 8.5;
		break;
		case 2 : fuelConsumedPer100Km = 7.8;
		break;
		case 3 : fuelConsumedPer100Km = 6.6;
		break;
		case 4 : fuelConsumedPer100Km = 5.7;
		break;
		case 5 : fuelConsumedPer100Km = 4.5;
		break;
		case 6 : fuelConsumedPer100Km = 3.9;
		break;
		default : System.out.println("You try to shift a gear that doesn't exist");
			}
	}	
	public double getPollution() {
		return 3;
	}
}
