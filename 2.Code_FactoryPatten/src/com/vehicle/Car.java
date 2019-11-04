package com.vehicle;

public class Car implements Vehicle {

	@Override
	public int set_num_of_wheels() {
		//System.out.println("Car Has 4 Wheels");
		return 4;
		
	}

	@Override
	public int set_num_of_passengers() {
		//System.out.println("Car can accomodate 4 passengers");
		return 5;
	}

	@Override
	public boolean has_gas() {
		return true;
	}

}
