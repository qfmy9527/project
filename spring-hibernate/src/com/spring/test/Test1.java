package com.spring.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Book;
import com.spring.service.BookService;

public class Test1 {
	    private ApplicationContext context;
	    private BookService bookService;
	    
	    {
	         context= new ClassPathXmlApplicationContext("ApplicationContext.xml");  
	         bookService=context.getBean(BookService.class);
	    }
	    @org.junit.Test
	    public void test()
	    {
	        DataSource dataSource=(DataSource) context.getBean(DataSource.class);
	        System.out.println(dataSource);
	    }
	    @org.junit.Test
	    public void test2()
	    {
	        String bookName=bookService.findById(1);
	        System.out.println(bookName);
	    }
	    
	    @org.junit.Test
	    public void test3()
	    {
	        bookService.addBook(new Book(2, "androidÔ´Âë·ÖÎö", "1002", 45, 10));
	    }
	}