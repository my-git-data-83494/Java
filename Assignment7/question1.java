package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1;
		System.out.print("Enter a string : ");
		s1 = sc.next();
		
		StringBuffer sb1 = new StringBuffer(s1);
		
		sb1.reverse();
		
		System.out.println("Reversed string : " + sb1);
		
		sc.close();

	}

}
