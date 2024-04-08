package tester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size;
		
		System.out.println("Number of Fruits you want : ");
		size = sc.nextInt();
		
		Fruit[] basket = new Fruit[size];
		
		int counter = 0;
		int choice;
		do {
			System.out.println();
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");
			System.out.print("ENTER YOUR CHOICE : ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("THANK YOU....");
				break;

			case 1:
				if (counter < size) {
					basket[counter] = new Mango();
				basket[counter].accept(sc);
				counter++;
				}else
					System.out.println("Basket is full");
				break;

			case 2:
				if (counter < size) {
					basket[counter] = new Orange();
				basket[counter].accept(sc);
				counter++;
				}else
					System.out.println("Basket is full");
				break;

			case 3:
				if (counter < size) {
					basket[counter] = new Apple();
				basket[counter].accept(sc);
				counter++;
				}else
					System.out.println("Basket is full");
				break;

			case 4:
				for (Fruit f : basket) {
					if (f != null)
						System.out.println(f.getName()+" ");
				}
				break;

			case 5:
				for (Fruit f : basket) {
					System.out.println(f.toString());
					System.out.println("Taste   : " + f.taste());
					System.out.println("Fresh : " + f.isFresh());
				}
				break;

			case 6:
				for(Fruit f : basket)
					if(f.taste() == "stale") {
						System.out.println(f.getName());
						System.out.println(f.taste());
					}	
				break;
				
			case 7:
				int index;
				System.out.print("which fruit you feel stale : ");
				index = sc.nextInt();
				if(index > size)
					System.out.println("This fruit is not in your Basket ");
				basket[index].setFresh(false);
				break;

			case 8:
				for(Fruit f : basket) {
					if(f instanceof Apple || f instanceof Orange) {
						f.setFresh(false);
						System.out.println(f.getName()+" is fresh ? "+f.isFresh()+" it's stale ");
					}
				}
				break;
				
			default :
				System.out.println("Fruit is stale select other one");
				break;
			}

		} while (choice != 0);
		
		sc.close();
	}

}
