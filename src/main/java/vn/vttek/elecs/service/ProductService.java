package vn.vttek.elecs.service;

import vn.vttek.elecs.entities.Product;

public interface ProductService {
    public Iterable<Product> listAllProducts();
	
    public Product getProductById(Integer id);

    public Product saveProduct(Product book);

    public void deleteProduct(Integer id);
}
