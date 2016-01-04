package si.user;

import java.util.HashMap;

import si.auto.Car;

import si.auto.Logan;

public class Main {

	public static void main(String[] args) {
	
	Car logan = new Logan(22,"alex");	
	logan.shiftGear(1);
	logan.drive(100);
	
	System.out.println("Available fuel: " +  logan.getAvailableFuel());
	}
	
	

}