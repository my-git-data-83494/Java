package com.sunbeam.emp;

import java.util.Scanner;

public class Salaried extends Employees {

	private double weeklySalary;
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter weekly Salary : ");
		weeklySalary = sc.nextDouble();
	}	
	
	@Override
	public String toString() {
		return super.toString()+"\nSalaried Employee : [weekly Salary =" + weeklySalary + "]";
	}
	
	

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Salaried Employees Salary : "+weeklySalary);
	}

//	@Override
//	public String toString() {
//		return "Salaried [weeklySalary=" + weeklySalary + ", fname=" + fname + ", lname=" + lname + ", ssn=" + ssn
//				+ "]";
//	}

}
