package vn.vttek.elecs.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

@Entity
@SequenceGenerator(name = "productIdSeq", sequenceName = "product_id_seq", allocationSize = 1)
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "productIdSeq")
    private Integer id;
    private String item_number;
    private String name;
    private String description;
    private String created_by_id;
    private Timestamp created_on;
    private int modified_by_id;
    private Timestamp modified_on;
    private String state;


}
