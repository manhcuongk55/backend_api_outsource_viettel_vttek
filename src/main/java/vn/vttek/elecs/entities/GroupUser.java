package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@SequenceGenerator(name = "usersIdSeq", sequenceName = "group_uses_id_seq", allocationSize=1)
public class GroupUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "group_userIdSeq")
    private int id;
    private String permission;
    private String group_name;
    private Date created_on;
}
