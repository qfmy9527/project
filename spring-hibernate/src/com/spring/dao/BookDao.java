package com.spring.dao;

import com.spring.bean.Book;

public interface BookDao {

	public String findById (int id);
	public void addBook(Book book);
	
}
