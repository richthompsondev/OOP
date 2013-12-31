package com.jony;

public class Employee {
	private String name;
	private String ID;
	private String office;
	private double salary;
	
	public double giveBonus(){
		return this.salary * 0.1;
	}
	
	double calculatesAnnualGain() {
		return salary*12;
	}
}
