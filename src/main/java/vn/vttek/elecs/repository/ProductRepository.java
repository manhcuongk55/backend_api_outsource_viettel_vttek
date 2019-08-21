package vn.vttek.elecs.repository;

import vn.vttek.elecs.entities.Product;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ProductRepository extends CrudRepository<Product,Integer>{

    
}
