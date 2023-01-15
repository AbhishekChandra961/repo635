package com.bridgelabz;

public class Class {
	byte age;
	double height;
	double weight;
	String Name;
	String employee;
	
	public static void main(String[] args) {
	
		Class abhishek = new Class();
		abhishek.age = 23;
		abhishek.height = 5.9;
		abhishek.weight = 65.5;
		abhishek.Name = "Abhishek Chandra";
		abhishek.employee = "Not Employee";
		
		System.out.println(abhishek.age);
		System.out.println(abhishek.height);
		System.out.println(abhishek.weight);
		System.out.println(abhishek.Name);
		System.out.println(abhishek.employee);
		
		Class abhi = new Class();
		abhi.age = 60;
		abhi.height = 6.9;
		abhi.weight = 105.5;
		abhi.Name = "Abhi Kumar";
		abhi.employee = "Employee";
		
		System.out.println(abhi.age);
		System.out.println(abhi.height);
		System.out.println(abhi.weight);
		System.out.println(abhi.Name);
		System.out.println(abhi.employee);
	}
}
