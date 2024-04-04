package tester;

import java.util.Scanner;

import com.app.geometry.*;

public class TestPointArray1 {
	public static void main(String[] args) {

		int noOfPoints;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Points to plot : ");
		noOfPoints = sc.nextInt();

		Point2D[] points = new Point2D[noOfPoints];

		for (int i = 0; i < noOfPoints; i++) {
			points[i] = new Point2D();
			points[i].accept();
		}
		int choice;

		do {
			System.out.println();
			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. Distance between Specific Points");
			System.out.println("4. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				int index;
				System.out.print("Enter point which you want : ");
				index = sc.nextInt();
				System.out.println("Points : " + points[index].getDetails());
				break;

			case 2:
//				for (int i = 0; i < noOfPoints; i++) {
//					System.out.println("Points : "+points[i].getDetails());
//				}
				for (Point2D element : points)
					System.out.println("Points : " + element.getDetails());
				break;

			case 3: {
				int index1, index2;
				System.out.print("Enter the index point1 : ");
				index1 = sc.nextInt();
				if (!(0 <= index1 && index1 <= noOfPoints - 1)) {
					System.out.println("Point1 are Invalid");
					break;
				}
				System.out.print("Enter the index point2 : ");
				index2 = sc.nextInt();
				if (!(0 <= index2 && index2 <= noOfPoints - 1)) {
					System.out.println("Point2 are Invalid");
					break;
				}
				if (points[index1].isEqual(points[index2])) {
					System.out.println("Points are same ");
					System.out.println("POints : " + points[index1].getDetails());
					System.out.println("POints : " + points[index2].getDetails());
				} else
					System.out.println("Distance between Points : " + points[index1].CalculateDistance(points[index2]));
			}
				break;

			case 4:
				System.out.println("Thank You...");
				break;

			default:
				System.out.println("INVALID... TRY AGAIN");
				break;
			}

		} while (choice != 4);

	}

}
