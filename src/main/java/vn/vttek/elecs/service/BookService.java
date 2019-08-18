package vn.vttek.elecs.service;

import vn.vttek.elecs.entities.Product;

public interface BookService {
    public Iterable<Product> listAllBooks();
	
    public Product getBookById(Integer id);

    public Product saveBook(Product book);

    public void deleteBook(Integer id);
}
