package tester;

import java.util.Scanner;

import com.sunbeam.emp.*;

public class SalaryCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int choice;
		System.out.println("TYPES OF EMPLOYEES");
		System.out.println("1. Salaried- Employee");
		System.out.println("2. Hourly- Employee");
		System.out.println("3. Commission- Employee");
		System.out.println("4. Baseplus commission - Employee");
		System.out.print("ENTER YOUR CHOICE : ");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 :
			Employees e1 = new Salaried();
			e1.accept(sc);
			System.out.println(e1.toString());
			e1.calculate();
			break;
		
		case 2:
			Employees e2 = new Hourly();
			e2.accept(sc);
			System.out.println(e2.toString());
			e2.calculate();
			break;
		
		case 3:
			Employees e3 = new Commission();
			e3.accept(sc);
			System.out.println(e3.toString());
			e3.calculate();
			break;
		
		case 4:
			Employees e4 = new Base_Salaried();
			e4.accept(sc);
			System.out.println(e4.toString());
			e4.calculate();
			Base_Salaried b1 = (Base_Salaried)e4;
			b1.givereward();
			
		default:
			System.out.println("WRONG CHOICE");
			break;
		}
		sc.close();
	}

}
