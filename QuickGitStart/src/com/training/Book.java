package com.training;

public class Book {

	public static final double discount=20;
	private String bookName;
	private String bookId;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, String bookId) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public static double getDiscount() {
		return discount;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + "]";
	}
	
}
