package com.polymorphism;

//  ------------------- CONSTRUCTOR OVERLOADING ---------------------------------

class Library {
	private String title;
	private String author;
	private double price;

	Library(String title) {
		this.title = title;
	}

	Library(String title, String author) {
		this.title = title;
		this.author = author;
	}

	Library(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void printAllDetails() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}
}

public class BookLibrary {
	public static void main(String[] args) {
		Library addBook = new Library("Yayati");
		addBook.printAllDetails();

		Library addBook2 = new Library("Mahabharat", "Ved vyas");
		addBook2.printAllDetails();

		Library addBook3 = new Library("Ikigai", "jinwoo", 899.00);
		addBook3.printAllDetails();
	}

}
