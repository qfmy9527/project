package com.spring.serviceImpl;

import com.spring.bean.Book;
import com.spring.dao.BookDao;
import com.spring.service.BookService;

public class BookserviceImpl implements BookService {

	

	
	private BookDao bookDao;
	public String findById(int id) {
		// TODO Auto-generated method stub
		
		System.out.println("����ѯ�����鱾"+Book.class);
		return bookDao.findById(id);
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookDao.addBook(book);
		System.out.println("��ӿα��ɹ�"+book);
	}

}
