package vn.vttek.elecs.entities;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
@Entity
@SequenceGenerator(name = "filesIdSeq", sequenceName = "files_id_seq", allocationSize=1)
public class File implements Serializable {
}
