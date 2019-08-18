package com.demo.Libreria.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "usersIdSeq", sequenceName = "users_id_seq", allocationSize=1)
public class Users implements Serializable{
    
	@Id    
    private String username;
    private String password;
    private int enabled=1;
   
    
    public Users() {}

    public Users (String password) {
    
        this.password = password;
        this.enabled = 1;
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

    public int getEnabled() {
            return enabled;
    }

    public void setEnabled(int enabled) {
            this.enabled = enabled;
    }
    
}
