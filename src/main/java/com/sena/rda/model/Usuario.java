package com.sena.rda.model;

<<<<<<< HEAD
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
>>>>>>> 6e60289f54b1cfb1684c780f3e1b8982649571cc
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
<<<<<<< HEAD
    public String tipoDoc;

    public Integer numDoc;
=======
    public String TipoDoc;

    @NotEmpty
    @Column(name = "Nomdoc", length = 20, nullable = false)
    public Integer Nomdoc;
>>>>>>> 6e60289f54b1cfb1684c780f3e1b8982649571cc

    @NotEmpty
    @Column(name = "correo", length = 50, nullable = false)
    public String correo;

    @NotEmpty
    @Column(name = "contrasena", length = 32, nullable = false)
    public String contrasena;
    
<<<<<<< HEAD
    public Integer tipoUser;

    public Boolean estado;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Evento> eventos;

=======
    @NotEmpty
    @Column(name = "TipoUser", length = 20, nullable = false)
    public Integer TipoUser;

    @NotEmpty
    @Column(name = "estado", nullable = false)
    public Boolean estado;

>>>>>>> 6e60289f54b1cfb1684c780f3e1b8982649571cc
    public Usuario() {

    }
    // constructor
<<<<<<< HEAD
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
=======
    public Usuario (Integer idUsuario, String nombre, String apellido, String TipoDoc , Integer Nomdoc, String correo, String contrasena, Integer TipoUser, Boolean estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.TipoDoc = TipoDoc;
        this.Nomdoc = Nomdoc;
        this.correo = correo;
        this.contrasena = contrasena;
        this.TipoUser = TipoUser;
>>>>>>> 6e60289f54b1cfb1684c780f3e1b8982649571cc
        
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
<<<<<<< HEAD
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
=======
        return TipoDoc;
    }
    public void setTipoDoc(String tipodoc) {
        TipoDoc = tipodoc;
    }
    //
    public Integer getNomdoc() {
        return Nomdoc;
    }
    public void setNomdoc(Integer nomdoc) {
        Nomdoc = nomdoc;
>>>>>>> 6e60289f54b1cfb1684c780f3e1b8982649571cc
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
<<<<<<< HEAD
        return tipoUser;
    }
    public void setTipoUser(Integer tipoUser) {
        this.tipoUser = tipoUser;
=======
        return TipoUser;
    }
    public void setCorreo(Integer TipoUser) {
        this.TipoUser = TipoUser;
>>>>>>> 6e60289f54b1cfb1684c780f3e1b8982649571cc
    }
    //
    public Boolean getestado() {
        return estado;
    }
<<<<<<< HEAD
    public void setestado(Boolean estado) {
=======
    public void setCorreo(Boolean estado) {
>>>>>>> 6e60289f54b1cfb1684c780f3e1b8982649571cc
        this.estado = estado;
    }
}