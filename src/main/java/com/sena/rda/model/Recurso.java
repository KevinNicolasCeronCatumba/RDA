package com.sena.rda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name = "recurso")
public class Recurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer idRecurso;

    @NotEmpty
    @Column(name = "nombre", length = 30, nullable = false)
    public String nombre;

    
    @NotEmpty
    @Column(name = "descripcion", length = 255, nullable = false)
    public String descripcion;

    public Recurso() {

    }
    // constructor
    public Recurso (Integer idRecurso, String nombre, String descripcion) {
        this.idRecurso = idRecurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        
    }
    // seters y getters
    public Integer getIdRecurso() {
        return idRecurso;
    }
    public void setIdUsuario(Integer idRecurso) {
        this.idRecurso = idRecurso;
    }
    //
    public String getNombre() {
        return nombre;
    }
    //
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //
    public String getdescripcion() {
        return descripcion;
    }
    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
}