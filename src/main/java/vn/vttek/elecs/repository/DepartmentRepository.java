package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.Department;
import vn.vttek.elecs.entities.Document;

import javax.transaction.Transactional;

@Transactional
public interface DepartmentRepository extends CrudRepository<Department,String>{
    
}
