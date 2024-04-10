package com.sunbeam.emp;

import java.util.Scanner;

public abstract class Employees {

	 String fname;
	 String lname;
	 int ssn;
	
	public Employees() {

	}
	
	public abstract void calculate();
	public void accept(Scanner sc)
	{
		System.out.print("Enter first name : ");
		fname = sc.next();
		System.out.print("Enter last name : ");
		lname = sc.next();
		System.out.print("Enter Social Security Number : ");
		ssn = sc.nextInt();
	}

	@Override
	public String toString() {
		return "\n[First_Name =" + fname + ", Last_Name =" + lname + ", Social Security Number =" + ssn + "]";
	}



	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	
	
	
	
	
	
}
