package com.sunbeam.emp;

import java.util.Scanner;

public class Commission extends Employees 
{
	private double commissionRate;
	private double grossSales;
	
	@Override
	public String toString() {
		return super.toString()+"\nCommission Employee : [commission_Rate =" + commissionRate + ", gross_Sales =" + grossSales + "]";
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Commission : ");
		commissionRate = sc.nextDouble();
		System.out.println("Enter Gross Sales : ");
		grossSales = sc.nextDouble();

	}
//	public void accept(Scanner sc) {
//		System.out.println("Enter Commission : ");
//		commissionRate = sc.nextDouble();
//		System.out.println("Enter Gross Sales : ");
//		grossSales = sc.nextDouble();
//	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Commission Employee Salary : "+(commissionRate*grossSales));
	}
	
}
