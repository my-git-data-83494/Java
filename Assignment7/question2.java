package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1;
		
		System.out.println("Enter a string : ");
		s1 = sc.next();
		
		StringBuffer sb1 = new StringBuffer(s1);
		
		StringBuffer sb2 = new StringBuffer(sb1.reverse());
		
//		if(s1.equals(sb2.toString()))
//		{
//			System.out.println("is palindrome...");
//		}else {
//			System.out.println("is not palindrome...");
//		}
		
		sb1.reverse();
		
		if(s1.equals(sb1.toString()))
		{
			System.out.println("is palindrome....");
		}
		else {
			System.out.println("is not palindrome....");
		}
		
		sc.close();

	}

}
