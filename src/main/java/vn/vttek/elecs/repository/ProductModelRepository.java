package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.ProductModel;

import javax.transaction.Transactional;

@Transactional
public interface ProductModelRepository extends CrudRepository<ProductModel,String>{
    
}
