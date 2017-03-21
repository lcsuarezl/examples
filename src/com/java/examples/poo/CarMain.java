package com.java.examples.poo;

public class CarMain {
	
	
	public static void main (String[] args){
		
		Car porche = new Car();
		Car holden = new Car();
		
		porche.setModel("Carrera");
		System.out.println("Model is "+porche.getModel());
		
		holden.setModel("Holden");

		System.out.println("Model is "+holden.getModel());
	}

}
