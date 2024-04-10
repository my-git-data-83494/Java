package com.sunbeam.entities;

import java.util.Scanner;

public class StringLength extends ExceptionLineTooLong {
	private String msg2;
	
	public void accept(Scanner sc) {
		System.out.println("Enter Message - ");
		msg2=sc.nextLine();
	}
	public void display() throws ExceptionLineTooLong {
		if(msg2.length()>5)
			throw new ExceptionLineTooLong();
		System.out.println("Message : "+msg2);
		System.out.println("Program Successful");
	}

}
