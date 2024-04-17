//Q2. Use Arrays.sort() to sort array of Students using Comparator. Write a menu driven code to
//display students
//1. sorted on their city (asc)
//2. sorted on their on marks (desc)
//3. sorted on their on name (asc)
//class Student {
//private int roll;
//private String name;
//private String city;
//private double marks;
//}

package com.sunbeam;

public class Student {
	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student() {
		
	}

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [Roll = " + roll + ", Name = " + name + ", City = " + city + ", Marks = " + marks + "]";
	}
	
	public String getCity() {
		return city;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}
}
