package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		
		int count = 0;
		String s1;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a String: ");
		s1 = sc.nextLine();
		
		s1.trim();
		
		String arr[] = s1.split(" ");
		
		
		for(String e : arr)
		{
			System.out.println(e);
			count++;
		}
		
		System.err.println("count of String is : " + count);
		
		sc.close();
		

	}

}
