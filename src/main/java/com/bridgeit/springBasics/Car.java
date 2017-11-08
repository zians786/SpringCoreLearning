package com.bridgeit.springBasics;

public class Car {

	public Car() {
		System.out.println("Car is Created....");
	}
	Vehicle car;

	public void setCar(Vehicle car) {
		this.car = car;
	}
	
	public void startCar() {
		System.out.println("Just Start the Car...");
		car.drive();
	}
}
