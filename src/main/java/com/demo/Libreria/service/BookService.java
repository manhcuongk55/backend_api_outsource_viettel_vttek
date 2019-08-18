package com.demo.Libreria.service;

import com.demo.Libreria.entities.Book;

public interface BookService {
    public Iterable<Book> listAllBooks();
	
    public Book getBookById(Integer id);

    public Book saveBook(Book book);

    public void deleteBook(Integer id);
}
