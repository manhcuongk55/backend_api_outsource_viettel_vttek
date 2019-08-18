package vn.vttek.elecs.entities;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
@Entity
@SequenceGenerator(name = "documentsIdSeq", sequenceName = "documents_id_seq", allocationSize=1)
public class Document implements Serializable {
}
