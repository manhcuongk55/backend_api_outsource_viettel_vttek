package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.PartBom;

import javax.transaction.Transactional;

@Transactional
public interface PartBomRepository extends CrudRepository<PartBom,Integer>{
    
}
