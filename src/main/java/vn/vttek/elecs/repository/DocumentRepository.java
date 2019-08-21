package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.Department;

import javax.transaction.Transactional;

@Transactional
public interface DocumentRepository extends CrudRepository<Department,String>{
    
}
