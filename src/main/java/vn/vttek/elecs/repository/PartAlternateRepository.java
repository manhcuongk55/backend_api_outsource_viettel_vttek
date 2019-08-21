package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.PartAlternate;

import javax.transaction.Transactional;

@Transactional
public interface PartAlternateRepository extends CrudRepository<PartAlternate,String>{
    
}
