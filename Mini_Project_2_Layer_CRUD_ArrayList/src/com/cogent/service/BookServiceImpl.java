package com.cogent.service;

import com.cogent.bean.BookBean;

import com.cogent.repo.BookRepo;

import com.cogent.repo.BookRepoImpl;

public class BookServiceImpl implements BookService {
	
	BookRepo bookRepo = new BookRepoImpl();

	@Override
	public void addBook(BookBean bookBean) {
		// TODO Auto-generated method stub
		
		bookRepo.addBook(bookBean);
		

	}

	@Override
	public void deleteBookByID(int bookID) {
		// TODO Auto-generated method stub
		
		bookRepo.deleteBookByID(bookID);

	}

	@Override
	public BookBean findBookByID(int bookID) {
		// TODO Auto-generated method stub
		
		return bookRepo.findBookByID(bookID);

	}

	@Override
	public BookBean findBookByAuthor(String bookAuthor) {
		// TODO Auto-generated method stub
		
		return bookRepo.findBookByAuthor(bookAuthor);
		

	}

	@Override
	public void findBookWithPriceRange(double min, double max) {
		// TODO Auto-generated method stub
		
		bookRepo.findBookWithPriceRange(min, max);

	}

}
