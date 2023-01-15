package com.bridgelabz;

public class Vehicle {
	//instance variable
	byte numberOfWheels; //1byte
	byte numberOFGears; //1byte
	String colour; //10byte
	String brand; //10byte
	String flueType; //10byte
	byte numberOfSeats;//1byte
	String transportType;//10byte
	//total byte is 43(1+1+10+10+10+1+10)
	public static void main(String[] args) {
		//bus is a object(object creation)
		//new=memory allocation
		//Vehicle()=constructer
		//Vehicle (befor bus)=non primitive datatype(user define datatype))
		Vehicle bus = new Vehicle();
		bus.numberOfWheels = 6;
		bus.numberOFGears = 7;
		bus.colour = "Red";
		bus.brand = "Tata";
		bus.flueType = "Diesel";
		bus.numberOfSeats = 48;
		bus.transportType = "Public Transport";
		//car is a object
		Vehicle  car = new Vehicle();
		car.numberOfWheels = 4;
		car.numberOFGears = 5;
		car.colour = "Black";
		car.brand = "Tata";
		car.flueType = "Petrol";
		car.numberOfSeats = 5;
		car.transportType = "Private Transport";
		
		System.out.println(bus.numberOfSeats);
	}

}
