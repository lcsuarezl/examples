package com.java.examples.poo.polymorphism;


class Car{
	
	private boolean engine; 
	private int cylinders; 
	private int wheels; 
	private String name;
	
	
	
	public Car(int cylinders, String name) {
		super();
		this.cylinders = cylinders;
		this.name = name;
		this.wheels=4;
		this.engine=true;
	}
	
	public String startEngine(){
		return "Car->startEngine()";
	}
	
	public String accelerate(){
		return "Car->accelerate()";
	}
	
	public String brake(){
		return "Car->brake()";
	}
	public boolean isEngine() {
		return engine;
	}
	public void setEngine(boolean engine) {
		this.engine = engine;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
		
}


class Mitsubishi extends Car{

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
		
	}
	
	@Override
	public String startEngine() {
		return "Mitsubishi->startEngine()";
	}
	
	@Override
	public String accelerate() {
		return "Mitsubishi->accelerate()";
	}
	
	@Override
	public String brake() {
		return "Mitsubishi->brake()";
	}
}

public class PolymorphismCar {

	
	public static void main(String[] args){
		
		Car car = new Car(8, "Base Car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
				System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
	}
}
