package vn.vttek.elecs.entities;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
@Entity
@SequenceGenerator(name = "usersIdSeq", sequenceName = "users_id_seq", allocationSize=1)
public class Part implements Serializable {
}
