package com.cogent.bean;

public class BookBean {
	
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private double bookPrice;
	
	public BookBean() {
		super();
	}
	
	public BookBean(int bookID, String bookTitle, String bookAuthor, int BookPrice) {
		super();
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	

}
