//Q2. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.

package com.cost.driving;

import java.util.Scanner;

public class DrivingCost {
	private double totalMiles;
	private double costGallon;
	private double avgMiles;
	private double parkingFees;
	private double tollPay;

	public DrivingCost() {

	}

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("****CALCULATE YOUR DAILY DRIVING COST****");
		System.out.print("Enter Total miles driven per day : ");
		totalMiles = sc.nextDouble();
		System.out.print("Enter Cost per gallon of gasoline : ");
		costGallon = sc.nextDouble();
		System.out.print("Enter Average miles per gallon : ");
		avgMiles = sc.nextDouble();
		System.out.print("Enter Parking fees per day : ");
		parkingFees = sc.nextDouble();
		System.out.print("Enter Tolls per day : ");
		tollPay = sc.nextDouble();
	}

	public void costCalculationPerDay() {
		double total = (totalMiles / avgMiles) * costGallon;
		System.out.println();
		System.out.println("COST OF DRIVING PER DAY : " + (parkingFees + tollPay + total));

	}

}
