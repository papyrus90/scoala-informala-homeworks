package si.user;

import parking.ValletParking;
import si.auto.Car;
import si.auto.Logan;


public class Main {

	public static void main(String[] args) {
	
	Car logan = new Logan(22,"alex");
	Car logan1 = new Logan(23,"safac");
	Car logan2 = new Logan(21,"gacax");
	Car logan3 = new Logan(21,"gsadax");
	Car logan5 = new Logan(21,"gacdasdaax");
	Car logan6 = new Logan(21,"gadasdcax");
	Car logan7 = new Logan(21,"gasdadccax");
	Car logan8 = new Logan(21,"gafdfascax");
	Car logan9 = new Logan(21,"gaczczqax");
	Car logan10 = new Logan(21,"qqwqdqdgacax");
	Car logan11 = new Logan(21,"xxacgacax");
	Car logan12 = new Logan(21,"cacasawgacax");
	Car logan13 = new Logan(21,"qqczxczgacax");
	Car logan14 = new Logan(21,"cxzczsagacax");
/*	
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
*/
	ValletParking<Car> carPark = new ValletParking<Car>();
	carPark.parkVehicle(logan);
	carPark.parkVehicle(logan1);
	carPark.parkVehicle(logan2);
	carPark.parkVehicle(logan3);
	carPark.parkVehicle(logan5);
	carPark.parkVehicle(logan6);
	carPark.parkVehicle(logan7);
	carPark.parkVehicle(logan8);
	carPark.parkVehicle(logan9);
	carPark.parkVehicle(logan10);
	carPark.parkVehicle(logan11);
	carPark.parkVehicle(logan12);
	carPark.parkVehicle(logan13);
	carPark.parkVehicle(logan14);
	
	
	
	
	
	}
	
	

}