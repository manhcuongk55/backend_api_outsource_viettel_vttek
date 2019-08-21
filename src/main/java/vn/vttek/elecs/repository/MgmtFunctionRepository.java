package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.MgmtFunction;

import javax.transaction.Transactional;

@Transactional
public interface MgmtFunctionRepository extends CrudRepository<MgmtFunction,String>{
    
}
