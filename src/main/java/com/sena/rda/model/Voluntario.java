package com.sena.rda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "voluntario")
public class Voluntario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer idVoluntario;

    
    @Column(name = "nombre", length = 30, nullable = false)
    public String nombre;

    
    
    @Column(name = "apellido", length = 30, nullable = false)
    public String apellido;

    
    
    @Column(name = "Nomdoc", length = 30, nullable = false)
    public Integer Nomdoc;

   
    @Column(name = "correo", length = 20, nullable = false)
    public String correo;

    
    
    @Column(name = "telefono", length = 30, nullable = false)
    public Integer telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEve")
    public Evento evento;
    
    public Voluntario() {

    }

    // constructor
    public Voluntario (Integer idVoluntario, String nombre, String apellido,  String correo, Integer telefono, Integer Nomdoc ) {
        this.idVoluntario = idVoluntario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.Nomdoc = Nomdoc;
        
    }

    // seters y getters

    public Integer getIdVoluntario() {
        return idVoluntario;
    }

    public void setIdVoluntario(Integer idVoluntario) {
        this.idVoluntario = idVoluntario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNomdoc() {
        return Nomdoc;
    }

    public void setNomdoc(Integer nomdoc) {
        Nomdoc = nomdoc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    
}
