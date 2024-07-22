package com.mycompany.interfaces;

import java.util.List;

import com.mycompany.models.Books;

public interface IUserFacade {
	public List<Books> getAvailableBooks(int userId, String filter) throws Exception;
	
	public List<Books> getLentBooks(int userId) throws Exception;
	
	public void lendBook(int userId, int bookId) throws Exception;
	
	public void returnBook(int userId, int bookId) throws Exception;
}