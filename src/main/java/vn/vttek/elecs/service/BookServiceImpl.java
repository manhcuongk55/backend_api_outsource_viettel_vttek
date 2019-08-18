/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.vttek.elecs.service;

import vn.vttek.elecs.entities.Product;
import vn.vttek.elecs.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Master
 */
@Service
public class BookServiceImpl implements BookService{
    
    @Autowired
    private BookRepository bookRepository;
    
    @Override
    public Iterable<Product> listAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Product getBookById(Integer id) {
        return bookRepository.findOne(id);
    }

    @Override
    public Product saveBook(Product book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.delete(id);
    }
    
}
