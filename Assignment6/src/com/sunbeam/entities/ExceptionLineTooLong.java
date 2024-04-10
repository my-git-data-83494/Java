package com.sunbeam.entities;


public class ExceptionLineTooLong extends Exception
{
	private String msg;
	
	public ExceptionLineTooLong() {
		msg="The string is too long";
	}
	
	@Override
	public void printStackTrace() {
		System.err.println("Exception");
		System.err.println("Message : "+msg);
	}
}
