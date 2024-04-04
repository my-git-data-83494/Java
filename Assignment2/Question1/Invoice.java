//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.

package p1;

import java.util.Scanner;

public class Invoice 
{
	private String partNumber;
	private String partDescription;
	private int itemQuantity;
	private double price;
	public double amount = 0;
	
	public Invoice()
	{
		
	}
	
	public Invoice(String partNumber, String partDescription, int itemQuantity)
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.itemQuantity = itemQuantity;
	}
	
	String getPartNumber()
	{
		return partNumber;
	}
	
	String getPartDescription()
	{
		return partDescription;
	}
	
	int getItemQuantity()
	{
		return itemQuantity;
	}
	
	void setItemQuantity()
	{
		this.itemQuantity = 0;
	}
	
	double getPrice()
	{
		return price;
	}
	
	void setPrice()
	{
		this.price = 0.0;
	}
	
	double invoiceAmount()
	{
		amount = itemQuantity * price;
		return amount;
	}
	
	Scanner sc = new Scanner(System.in);
	
	void accept()
	{
		System.out.print("Part number : ");
		partNumber = sc.nextLine();
		
		System.out.print("Part Description : ");
		partDescription = sc.nextLine();
		
		System.out.print("Purchased Quantity : ");
		itemQuantity = sc.nextInt();
		if(itemQuantity < 0)
			setItemQuantity();
			
		System.out.print("Amount : ");
		price = sc.nextDouble();
		if(price < 0)
			setPrice();
	}

}
