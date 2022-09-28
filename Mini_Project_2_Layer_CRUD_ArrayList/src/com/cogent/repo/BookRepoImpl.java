package com.cogent.repo;

import com.cogent.bean.BookBean;


import java.util.*;

public class BookRepoImpl implements BookRepo {
	//Repository - Database
	List<BookBean> books = new ArrayList<BookBean>();
	//Example of necessary Instance Instantiation Block
	{
		books.add(new BookBean(1, "Learn Java in 2 mins", "Samuel", 110));
		books.add(new BookBean(2, "Learn Spring in 2 mins", "Bryan", 210));
		books.add(new BookBean(3, "Learn Angular in 2 mins", "Ashley", 250));
		
		//books.remove(0);
		
	}
	
	
	
	@Override
	public void addBook(BookBean bookBean) {
		
		books.add(bookBean);
		
	}

	@Override
	public void deleteBookByID(int bookID) {
		
		

	}

	@Override
	public BookBean findBookByID(int bookID) {
		// TODO Auto-generated method stub
		BookBean book = null;
		for (int i = 0; i < books.size(); i++) {
			book = books.get(i);
			if (book.getBookId() == bookID) {
				System.out.println("Book Found in Repository");
				return book;
			}
			book = null;
		
		}
		return book;
		
	}

	@Override
	public BookBean findBookByAuthor(String bookAuthor) {
		// TODO Auto-generated method stub
		BookBean book = null;
		for (int i = 0; i < books.size(); i++) {
			book = books.get(i);
			if (book.getBookAuthor() == bookAuthor) {
				System.out.println("Book Found in Repository");
				return book;
			}
			book = null;
		}
		return book;
	}

	@Override
	public void findBookWithPriceRange(double min, double max) {
		// TODO Auto-generated method stub

	}

}
