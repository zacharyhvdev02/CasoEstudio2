package com.mycompany.views;

import java.awt.Component;

public class BooksDecorator extends Books {
	
	protected Books books;
	
	public BooksDecorator(Books books) {
		this.books = books;
	}
	
	protected void InitStyles() {
		this.books.InitStyles();
	}
	
	protected void LoadBooks() {
		this.books.LoadBooks();
	}  
	
	@Override
	public void Init() {
		this.books.Init();
	}
	
	public javax.swing.JPanel getPanel() {
		return this.books;
	}
 
}
