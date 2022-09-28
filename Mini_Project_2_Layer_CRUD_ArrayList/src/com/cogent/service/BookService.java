package com.cogent.service;

import com.cogent.bean.BookBean;

public interface BookService {
	
	public void addBook(BookBean bookBean);
	public void deleteBookByID(int bookID);
	public BookBean findBookByID(int bookID);
	public BookBean findBookByAuthor(String bookAuthor);
	public void findBookWithPriceRange(double min, double max);

}
