package si.auto;
import java.util.*; 

public class CarInventory {
	

	public static void main(String[] args) {
		Map<String ,Car> carMap = new HashMap<String,Car>();
		Car logan = new Logan(22,"alxca2");
		Car nova = new SuperNova(35,"asdam1");
		Car golf = new VWGolf(99,"njoqp3");
		Car passat = new VWPassat(62,"mmaro5");
	
		carMap.put("alxca2", logan);
		carMap.put("asdam1", nova);
		carMap.put("njoqp3", golf);
		carMap.put("mmaro5", passat);
		
		carMap.entrySet();
		
		
		carMap.remove("alxca2");
		carMap.get("asdam1");
		carMap.get("alxca2");
		
		
		CarWash carWash = new CarWash();
		carWash.openShop();
		carWash.standInLine(logan);
		carWash.standInLine(nova);
		carWash.standInLine(logan);
		carWash.standInLine(golf);
		
		carWash.washCar();
		carWash.standInLine(passat);
		carWash.washCar();
		carWash.washCar();
		
		
		carWash.printClients();
		carWash.closeShop();
		
		

	
	}

}
