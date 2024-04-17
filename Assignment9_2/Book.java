//Q1. Store book details in a library in hashing based data structure : HashSet
//Book details : isbn(string), category(enum), price(double), authorName(string), quantity(int) .
//Unique ID : isbn
//Write a menu driven code that have below menus.
//1. Accept book details and add in collection
//2. Display all books from collection
//3. Sort the book details as per category and display it.
//4. Sort the book details as per author and display it.
//5. Find book by id.

package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

enum Category {
	Fantacy, Comedy, Historical, Motivational, Suspencious;
}

public class Book {

	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	Category category;

	public Book() {

	}

	public Book(String isbn, double price, String authorName, int quantity, Category category) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
		this.category = category;
	}

	public void accept(Scanner sc) {
		System.out.print("Enter ISBN        : ");
		isbn = sc.next();
		System.out.print("Enter Author Name : ");
		authorName = sc.next();
		System.out.print("Enter Price       : ");
		price = sc.nextDouble();
		System.out.print("Enter Quantity    : ");
		quantity = sc.nextInt();
		System.out.println("Select Book Category :" + "\nFantacy, Comedy, Historical, Motivational, Suspencious");
		category = Category.valueOf(sc.next());
		if (category != Category.Comedy || category != Category.Fantacy || category != Category.Historical
				|| category != Category.Motivational || category != Category.Suspencious)
			throw new IllegalArgumentException();
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ ", category=" + category.name() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);

	}

}
