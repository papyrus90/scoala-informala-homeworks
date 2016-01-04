package si.auto;

public class SuperNova extends Dacia {
	private static final int FUEL_TANK_SIZE = 45;
	public SuperNova(int currentFuelAmount,String chassisNumber){
		super(currentFuelAmount,chassisNumber);
}
	final double pollutionPerKm =0.3;
	int[]gear={1,2,3,4,5,6};
	
	public void shiftGear(int gear){
		if (gear == 1) {
			fuelConsumedPer100Km = 9.9;
			}
		if(gear==2){
			fuelConsumedPer100Km = 8.9;
		}
		if(gear==3){
			fuelConsumedPer100Km = 7.9; 
		}
		if(gear==4){
			fuelConsumedPer100Km = 6.9;
		}
		if(gear==5){
			fuelConsumedPer100Km = 5.9;
		}
		if(gear==6){
			fuelConsumedPer100Km = 4.9;
		}
	}
	public double getPollution() {
		return 4;
	}

}