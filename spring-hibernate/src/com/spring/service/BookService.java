package com.spring.service;

import com.spring.bean.Book;

public interface BookService {
    public String findById(int id);
    public void addBook(Book book);
}
