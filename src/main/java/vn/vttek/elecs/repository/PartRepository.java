package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.Part;

import javax.transaction.Transactional;

@Transactional
public interface PartRepository extends CrudRepository<Part,Integer>{
    
}
