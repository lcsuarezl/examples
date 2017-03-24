package com.java.examples.poo.encapsulation;

public class Printer {

	private double tonerLevel;
	private int printedPages;
	private boolean duplex;

	public Printer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Printer(int tonerLevel, boolean duplex) {
		super();
		if (tonerLevel > 0 && tonerLevel < 100){
			this.tonerLevel = tonerLevel;
		}else{
			this.tonerLevel = 0;
		}
		this.printedPages = 0;
		this.duplex = duplex;
	}

	public void print(int pages) {
		int i = 1;
		while (i < pages) {
			if (isDuplex()) {
				if (printPageDuplex()) {
					i += 2;
				} else {
					break;
				}
			} else {
				if (printPage()) {
					i++;
				} else {
					break;
				}
			}
		}
		System.out.println("\nPrinted " + i + " pages of " + pages);
	}

	private boolean printPageDuplex() {
		if (tonerLevel > 0.4d) {
			System.out.print(".");
			this.tonerLevel -= 0.4d;
			this.printedPages += 2;
			return true;
		} else {
			System.out.println("\nEmty toner please fill first!");
			return false;
		}
	}

	private boolean printPage() {
		if (tonerLevel > 0.2d) {
			System.out.print(".");
			this.tonerLevel -= 0.2d;
			this.printedPages++;
			return true;
		} else {
			System.out.println("\nEmty toner please fill first!");
			return false;
		}

	}

	public void fillToner(int number) {
		if (number < 0) {
			System.out.println(number + " is not a valid fill toner number");
		} else {

			if (this.tonerLevel + number > 100) {
				System.out.println("Maximun level of toner reached! ");
				this.tonerLevel = 100;
				System.out.println("Toner filled at maximum current level is " + tonerLevel);
			} else {
				this.tonerLevel += number;
				System.out.println("Toner filled by " + number + " current level is " + tonerLevel);
			}
		}
	}

	public double getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(double tonerLevel) {
		if (tonerLevel < 0) {
			System.out.println("toner Level must be >0");
			return;
		}
		if (tonerLevel > 100) {
			System.out.println("Max level of 100% reached");
			tonerLevel = 100;
		}
		this.tonerLevel = tonerLevel;
	}

	public void getStatus() {
		System.out.println("This printer is " + (isDuplex() ? " duplex " : " single ") + ", the toner is at "
				+ tonerLevel + "% and has print " + printedPages + " pages");
	}

	public int getPrintedPages() {
		return printedPages;
	}

	public void setPrintedPages(int printedPages) {
		this.printedPages = printedPages;
	}

	public boolean isDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}

}
