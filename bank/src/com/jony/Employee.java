package com.jony;

public class Employee extends Person {
	private String office;
	private double salary;

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus(){
		return this.salary * 0.1;
	}
	
	double calculatesAnnualGain() {
		return salary*12;
	}
}
