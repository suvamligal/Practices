package com.practices.encapsulation;

public class VehicleMain {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		System.out.println(vehicle.name);
		vehicle.name="VW";
		System.out.println(vehicle.name);
	}
	
	
	

}
