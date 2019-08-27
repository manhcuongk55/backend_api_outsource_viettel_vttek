package vn.vttek.elecs.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM product p WHERE LOWER(p.name) = LOWER(:id) or LOWER(p.description) = LOWER(:id)")
    Page<Product> getListProduct(@Param("id") String id);
}
