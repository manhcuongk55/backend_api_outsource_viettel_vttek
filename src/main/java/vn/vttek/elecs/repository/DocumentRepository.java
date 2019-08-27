package vn.vttek.elecs.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.vttek.elecs.entities.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    @Query("select new com.foo.bar.entity.Document(d.docId, d.filename) from Document d where d.filterCol = ?1")
    Page<Document> findDocumentsForListing(String filterValue);
}
