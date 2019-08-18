package com.demo.Libreria.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

@Entity
@SequenceGenerator(name = "bookIdSeq", sequenceName = "book_id_seq", allocationSize=1)
public class Book implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "bookIdSeq")
    private Integer id;
    
    private String nombre;
    private String genero;
    private String autor;
    
    public Book() {}

    public Book(String nombre, String genero, String autor) {
        this.nombre = nombre;
        this.genero = genero;
        this.autor = autor;
    } 
  
    public Integer getId() {
		return id;
    }

    public void setId(Integer id) {
            this.id = id;
    }

    public String getNombre() {
            return nombre;
    }

    public void setNombre(String nombre) {
            this.nombre = nombre;
    }

    public String getGenero() {
            return genero;
    }

    public void setGenero(String genero) {
            this.genero = genero;
    }
    public String getAutor() {
            return autor;
    }

    public void setAutor(String autor) {
            this.autor = autor;
    }
 
}
