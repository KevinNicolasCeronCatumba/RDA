package com.sena.rda.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "voluntario")
public class Voluntario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer idVoluntario;

    @NotEmpty
    @Column(name = "nombre", length = 20, nullable = false)
    public String nombre;

    
    @NotEmpty
    @Column(name = "apellido", length = 20, nullable = false)
    public String apellido;

    
    @NotEmpty
    @Column(name = "Nomdoc", length = 20, nullable = false)
    public Integer Nomdoc;

    @NotEmpty
    @Column(name = "correo", length = 20, nullable = false)
    public String correo;

    
    @NotEmpty
    @Column(name = "telefono", length = 20, nullable = false)
    public Integer telefono;

    @OneToMany(mappedBy = "voluntario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Asistencia> asistencia;


    public Voluntario() {
        asistencia = new ArrayList<Asistencia>();
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

    public List<Asistencia> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(List<Asistencia> asistencia) {
        this.asistencia = asistencia;
    }

}
