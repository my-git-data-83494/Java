import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter two number-");
		
		if(sc.hasNextDouble()) 
		{
			double num1=sc.nextDouble();
			if(sc.hasNextDouble())
			{
			double num2=sc.nextDouble();
			{
			System.out.println("Average is "+(num1=num2)/2);
		    }
	    }
		else 
			System.out.println("Second value entered is wrong");
			}
			else
				System.out.println("First Value entered is wrong");

	}

}
