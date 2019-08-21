package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.BomInstance;

import javax.transaction.Transactional;

@Transactional
public interface BomInstancetRepository extends CrudRepository<BomInstance, String> {

}
