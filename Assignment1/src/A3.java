import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int quantity;
		double totalbill = 0.0;
		double Dosa = 50.00;
		double Samosa = 20.00;
		double Idli = 40.00;
		double Burger = 30.00;
		double Pizza = 100.00;
		
		do {
			System.out.println("Welcome to Food Mart");
			System.out.println("1. Dosa");
			System.out.println("2. Samosa");
			System.out.println("3. Idli");
			System.out.println("4. Burger");
			System.out.println("5. Pizza");
			System.out.println("6. Generate Bill");
			System.out.println("Enter yoir Choice");
			
			choice=sc.nextInt();
			 switch (choice) {
			 case 0:
				 System.out.println("Thank You for visiting out Food Mart");
			 case 1:
				 System.out.println("How much Dosa do you want?");
				 quantity = sc.nextInt();
				 totalbill += Dosa * quantity;
				 break;
			 case 2:
				 System.out.println("How much Samosa do you want?");
				 quantity = sc.nextInt();
				 totalbill += Samosa * quantity;
				 break;
			 case 3:
				 System.out.println("How much Idli do you want?");
				 quantity = sc.nextInt();
				 totalbill += Idli * quantity;
				 break;
			 case 4:
				 System.out.println("How much Burger do you want?");
				 quantity = sc.nextInt();
				 totalbill += Burger * quantity;
				 break;
			 case 5:
				 System.out.println("How much Pizza do you want?");
				 quantity = sc.nextInt();
				 totalbill += Pizza * quantity;
				 break;
			 case 6:
				 System.out.println("Your total amount is:"+totalbill);
				 break;
			 default:
				 System.out.println("invalid Choice");
			 }
		} while(choice !=0);
		sc.close();

	}

}
