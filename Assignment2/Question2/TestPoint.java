package Tester;

import java.util.Scanner;

import com.app.geometry.*;

public class TestPoint {

	public static void main(String[] args) 
	{
		double x1,y1,x2,y2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter points for p1(x1,y1) : ");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		
		System.out.print("Enter points for p2(x2,y2) : ");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		
		if(p1.isEqual(p2))
		{
			System.out.println("Co-ordinate are at Same point ");
			System.out.println("Point P1 : "+p1.getDetails());
			System.out.println("Point P2 : "+p2.getDetails());
		}
		else 
			System.out.println("Distance Between P1 and P2 : "+p1.CalculateDistance(p2));
	
	}

}
