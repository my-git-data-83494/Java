package com.sunbeam.emp;

import java.util.Scanner;

public class Base_Salaried extends Commission {

	private double baseSalary;

	@Override
	public String toString() {
		return super.toString()+"\nBase_Salaried commission Employee [Base-Salary =" + baseSalary + "]";
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter base-salary : ");
		baseSalary = sc.nextDouble();
	}
	
	double salary =0;
	
	@Override
	public void calculate() {
		System.out.println("Base-Salary : "+baseSalary);
		salary = (getCommissionRate() * getGrossSales())+baseSalary;
		System.out.println("base-salaried Employees salary : "+salary);
	}
	
	public void givereward()
	{
		System.out.println("Reward salaried-commission employees Salary : "+(salary+baseSalary*0.1));
	}
	
}

