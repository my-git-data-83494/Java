package com.app.geometry;

import java.util.Scanner;

public class Point2D {

	private int x;
	private int y;

	public Point2D() {
		// TODO Auto-generated constructor stub
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		String details;
		details = "(" + x + "," + y + ")";
		return details;
	}

	Scanner sc = new Scanner(System.in);

	public void accept() {

		System.out.print("Enter the Point(x,y) : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}

	public boolean isEqual(Point2D p) {
		if (this.x == p.x && this.y == p.y) {
			return true;
		} else
			return false;
	}

	public double CalculateDistance(Point2D p) {
		double x = Math.pow((p.x - this.x), 2);
		double y = Math.pow((p.y - this.y), 2);
		double dist = Math.sqrt(x + y);
		return dist;
	}

}
