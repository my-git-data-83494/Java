package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh = true;

	public Fruit() {
		
	}
	
	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String toString() {
		return "Fruit : { color=" + color + ", weight=" + weight + ", name=" + name + "}";
	}

	public String taste() {
		return "No specific taste";
	}
	
	public void accept(Scanner sc) 
	{
		System.out.print("Enter Name : ");
		name = sc.next();
		System.out.print("Enter Weight : ");
		weight = sc.nextDouble();
		System.out.print("Enter Color : ");
		color = sc.next();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	
}


