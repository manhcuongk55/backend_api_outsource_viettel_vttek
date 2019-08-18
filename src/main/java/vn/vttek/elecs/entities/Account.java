package vn.vttek.elecs.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "usersIdSeq", sequenceName = "users_id_seq", allocationSize=1)
public class Account implements Serializable{
    
	@Id    
    private int id;
	private int group_id;
    private String username;
    private String password;
    private String gender;
    private String email;
    private String phone;
    private int identify_number;
    private String grand_permission;
    private String department_id;
    private String state;
    private Date created_on;
    private int enabled=1;
   
    
    public Account() {}

    public Account(String password) {
    
        this.password = password;
        this.enabled = 1;
    }

    public Account(int id) {
        this.id = id;
    }

    public Account(int id, int group_id, String username, String password, String gender, String email, String phone, int identify_number, String grand_permission, String department_id, String state, Date created_on, int enabled) {
        this.id = id;
        this.group_id = group_id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.identify_number = identify_number;
        this.grand_permission = grand_permission;
        this.department_id = department_id;
        this.state = state;
        this.created_on = created_on;
        this.enabled = enabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIdentify_number() {
        return identify_number;
    }

    public void setIdentify_number(int identify_number) {
        this.identify_number = identify_number;
    }

    public String getGrand_permission() {
        return grand_permission;
    }

    public void setGrand_permission(String grand_permission) {
        this.grand_permission = grand_permission;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
}
