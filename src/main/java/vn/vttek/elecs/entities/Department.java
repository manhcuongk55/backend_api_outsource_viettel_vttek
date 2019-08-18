package vn.vttek.elecs.entities;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
@Entity
@SequenceGenerator(name = "departmentsIdSeq", sequenceName = "departments_id_seq", allocationSize=1)
public class Department implements Serializable {
}
