package com.cogent.client;

import java.util.Scanner;

import com.cogent.bean.BookBean;

import com.cogent.service.BookService;

import com.cogent.service.BookServiceImpl;

public class BookLibrary {

	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		Scanner scanner = new Scanner(System.in);
		//BookBean bookBean = null;
		
		//Add New Book
		
		BookBean bookBean = new BookBean();
		
		System.out.println("Enter Book ID");
		bookBean.setBookId(scanner.nextInt());
		
		System.out.println("Enter Book Title");
		bookBean.setBookTitle(scanner.next());
		
		System.out.println("Enter Book Author");
		bookBean.setBookAuthor(scanner.next());
		
		System.out.println("Enter Book Price");
		bookBean.setBookPrice(scanner.nextDouble());
		
		bookService.addBook(bookBean);
		
		
		

		//Delete Book
		
		//Search Book By ID
		System.out.println("Please enter Book ID");
		BookBean book = bookService.findBookByID(scanner.nextInt());
		if (book != null) {
			System.out.println(book.getBookId() + " " + book.getBookTitle() + " " + book.getBookAuthor() + " " + book.getBookPrice());
		}
		else {
			System.out.println("Book Not Found");
		}
		
		//Search Book By Author
		

	}

}
