package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Display {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		arr[0] = new Student(21, "Sahil ", "Begaluru ", 82);
		arr[1] = new Student(17, "Hemant", "Delhi    ", 87);
		arr[2] = new Student(13, "Vinay ", "Kolhapur ", 91);
		arr[3] = new Student(19, "Shree ", "Ratnagiri", 84);
		arr[4] = new Student(30, "Nilesh", "Pune     ", 77);

		int choice;

		do {
			System.out.println("0. Exit");
			System.out.println("1. sorted on their city (asc) ");
			System.out.println("2. sorted on their on marks (desc) ");
			System.out.println("3. sorted on their on name (asc) ");
			System.out.print("Enter your Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("THANK YOU");
				break;
			case 1:

				class StudentCity implements Comparator<Student> {
					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getCity().compareTo(o2.getCity());
						return value;
					}
				}

				StudentCity compareCity = new StudentCity();
				Arrays.sort(arr, compareCity);

				System.out.println("Sorted on their City (asc) : ");
				
				for (Student element : arr)
					System.out.println(element);

				break;
				
			case 2:
				class StudentMarks implements Comparator<Student> {
					@Override
					public int compare(Student o1, Student o2) {
						int value = (int) (o1.getMarks() - o2.getMarks()) ;
						return -value; // -ve for descending order
					}
				}

				StudentMarks compareMarks = new StudentMarks();
				Arrays.sort(arr, compareMarks);

				System.out.println("Sorted on their on Marks (desc) : ");
				
				for (Student element : arr)
					System.out.println(element);

				break;
				
			case 3:
				class StudentName implements Comparator<Student> {
					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getName().compareTo(o2.getName());
						return value;
					}
				}

				StudentName compareName = new StudentName();
				Arrays.sort(arr, compareName);

				System.out.println("sorted on their on Name (asc) : ");
				
				for (Student element : arr)
					System.out.println(element);

				break;
				
			default: 
				System.out.println("RECHECK YOUR CHOICE");
				break;
			}

		} while (choice != 0);
		
		sc.close();
	}

}
