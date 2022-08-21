package com.sena.rda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer idUsuario;

    @NotEmpty
    @Column(name = "nombre", length = 30, nullable = false)
    public String nombre;

    
    @NotEmpty
    @Column(name = "apellido", length = 30, nullable = false)
    public String apellido;

    @NotEmpty
    @Column(name = "TipoDoc", length = 4, nullable = false)
    public String tipoDoc;

    public Integer numDoc;

    @NotEmpty
    @Column(name = "correo", length = 50, nullable = false)
    public String correo;

    @NotEmpty
    @Column(name = "contrasena", length = 32, nullable = false)
    public String contrasena;
    
    public Integer tipoUser;

    public Boolean estado;

    public Usuario() {

    }
    // constructor
    public Usuario (Integer idUsuario, String nombre, String apellido, String tipoDoc , Integer numDoc, String correo, String contrasena, Integer tipoUser, Boolean estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipoUser = tipoUser;
        this.estado = estado;
        
    }
    // seters y getters
    public Integer getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    //
    public Integer getNumDoc() {
        return numDoc;
    }
    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }
    //
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    //
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    //
    public Integer getTipoUser() {
        return tipoUser;
    }
    public void setTipoUser(Integer tipoUser) {
        this.tipoUser = tipoUser;
    }
    //
    public Boolean getestado() {
        return estado;
    }
    public void setestado(Boolean estado) {
        this.estado = estado;
    }
}