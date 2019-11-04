package com.vehicle;


public class VehicleFactory {
	public Vehicle getInstance(String str) {

		if(str.equals("Plane"))
			
			return new Plane();
		else if(str.equals("Car"))
			return new Car();
		else 
			return null;
		
		
	}
}
