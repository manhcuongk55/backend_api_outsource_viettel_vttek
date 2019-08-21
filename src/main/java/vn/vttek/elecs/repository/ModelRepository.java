package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.Model;

import javax.transaction.Transactional;

@Transactional
public interface ModelRepository extends CrudRepository<Model,Integer>{
    
}
