package com.jony.model;

import com.jony.model.Person;
/**
 * Abstract class representing an employee
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
// Abstract, so the class can't be instantiated
public abstract class Employee extends Person {
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

	// Method implemented in the child class
	public abstract double getBonus();
	
	double calculatesAnnualGain() {
		return salary*12;
	}
}
