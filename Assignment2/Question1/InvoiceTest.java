package p1;

public class InvoiceTest 
{

	public static void main(String[] args) 
	{
		Invoice i = new Invoice();
		i.accept();
		System.out.println("*******INVOICE*******");
		System.out.println("Part Number   : "+i.getPartNumber());
		System.out.println("Part Number   : "+i.getPartDescription());
		System.out.println("Part Number   : "+i.getItemQuantity());
		System.out.println("Part Number   : "+i.getPrice());
		System.out.println("Total Ammount : "+i.invoiceAmount());
	}

}
