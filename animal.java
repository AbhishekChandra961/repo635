package com.bridgelabz;

public class animal {
	byte legs;
	String colour;
	String mammalOrNot;
	String waterEarthSky;
	
	public static void main(String[] args) {
		
		animal dog = new animal();
		dog.legs = 4;
		dog.colour = "black";
		dog.mammalOrNot = "mammal";
		dog.waterEarthSky = "Earth";
		
		System.out.println(dog.legs);
		System.out.println(dog.colour);
		System.out.println(dog.mammalOrNot);
		System.out.println(dog.waterEarthSky);
		
		animal crow = new animal();
		crow.legs = 2;
		crow.colour = "black";
		crow.mammalOrNot = "Non-mammal";
		crow.waterEarthSky = "Sky";
		
		System.out.println(crow.legs);
		System.out.println(crow.colour);
		System.out.println(crow.mammalOrNot);
		System.out.println(crow.waterEarthSky);
	}
}
