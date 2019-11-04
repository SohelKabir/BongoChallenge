package com.vehicle;

public class Plane implements Vehicle {

	@Override
	public int set_num_of_wheels() {
		//System.out.println("Plane has 3 wheels");
		return 3;
	}

	@Override
	public int set_num_of_passengers() {
		//System.out.println("Plane can accomodate more than 100 passengers");
		return 100;
	}

	@Override
	public boolean has_gas() {
		return false;
	}

}
