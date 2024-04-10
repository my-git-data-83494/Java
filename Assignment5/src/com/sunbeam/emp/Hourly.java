package com.sunbeam.emp;

import java.util.Scanner;

public class Hourly extends Employees {

	private double wage;
	private int hrs;

	public Hourly() {
		// TODO Auto-generated constructor stub
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter Hourly wage : ");
		wage = sc.nextDouble();
		System.out.print("Enter work of Hours : ");
		hrs = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nHourly Employee [hourly wage =" + wage + ", hours worked =" + hrs + "]";
	}

	@Override
	public void calculate() {
		double salary = 0;
		if (hrs <= 40)
			salary = (wage * hrs);
		else if (hrs > 40) {
			salary = 40 * wage + (hrs - 40) * wage * 1.5;
		}

		System.out.println("Hourly Employee Salary : "+salary);
	}

}
