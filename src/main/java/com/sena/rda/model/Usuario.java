package com.sena.rda.model;

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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer idUsuario;

    @NotEmpty(message="El campo Nombre es obligatorio")
    @Column(name = "nombre", length = 30, nullable = false)
    public String nombre;

    
    @NotEmpty(message="El campo Apellido es obligatorio")
    @Column(name = "apellido", length = 30, nullable = false)
    public String apellido;

    @NotEmpty(message="El campo Tipo Documento es obligatorio")
    @Column(name = "TipoDoc", length = 4, nullable = false)
    public String tipoDoc;

    @NotNull(message="El campo Numero Documento es obligatorio")
    public Integer numDoc;

    @NotEmpty(message="El campo Correo Electronico es obligatorio")
    @Email
    @Column(name = "correo", length = 50, nullable = false)
    public String correo;

    @NotEmpty(message="El campo Contraseña es obligatorio")
    @Column(name = "contrasena", length = 32, nullable = false)
    public String contrasena;
    
    public Integer tipoUser;

    public Boolean estado;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Evento> eventos;

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