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
    public String TipoDoc;

    public Integer NomDoc;

    @NotEmpty
    @Column(name = "correo", length = 50, nullable = false)
    public String correo;

    @NotEmpty
    @Column(name = "contrasena", length = 32, nullable = false)
    public String contrasena;
    
    public Integer TipoUser;

    public Boolean estado;

    public Usuario() {

    }
    // constructor
    public Usuario (Integer idUsuario, String nombre, String apellido, String TipoDoc , Integer NomDoc, String correo, String contrasena, Integer TipoUser, Boolean estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.TipoDoc = TipoDoc;
        this.NomDoc = NomDoc;
        this.correo = correo;
        this.contrasena = contrasena;
        this.TipoUser = TipoUser;
        
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
        return TipoDoc;
    }
    public void setTipoDoc(String tipodoc) {
        TipoDoc = tipodoc;
    }
    //
    public Integer getNomDoc() {
        return NomDoc;
    }
    public void setNomdoc(Integer nomdoc) {
        NomDoc = nomdoc;
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
        return TipoUser;
    }
    public void setCorreo(Integer TipoUser) {
        this.TipoUser = TipoUser;
    }
    //
    public Boolean getestado() {
        return estado;
    }
    public void setCorreo(Boolean estado) {
        this.estado = estado;
    }
}