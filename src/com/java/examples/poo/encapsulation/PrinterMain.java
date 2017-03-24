package com.java.examples.poo.encapsulation;

public class PrinterMain {

	public static void main(String[] args) {
		Printer duplexPrinter = new Printer(100, true);

		Printer normalPrinter = new Printer(80, false);
		duplexPrinter.getStatus();

		duplexPrinter.print(200);
		duplexPrinter.getStatus();
		duplexPrinter.fillToner(59);
		duplexPrinter.getStatus();

		normalPrinter.getStatus();

		normalPrinter.print(500);
		normalPrinter.getStatus();
		normalPrinter.fillToner(20);
		normalPrinter.getStatus();
	}
}
