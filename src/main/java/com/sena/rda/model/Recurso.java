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

    @OneToMany(mappedBy = "recurso", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<DetalleRecurso> detallerecurso;
    //constructor
    public Recurso(){

    }
    public Recurso(Integer idRecurso, @NotEmpty String nombre, @NotEmpty String descripcion,
            List<DetalleRecurso> detallerecurso) {
        this.idRecurso = idRecurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.detallerecurso = detallerecurso;
    }
    public Integer getIdRecurso() {
        return idRecurso;
    }
    public void setIdRecurso(Integer idRecurso) {
        this.idRecurso = idRecurso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<DetalleRecurso> getDetallerecurso() {
        return detallerecurso;
    }
    public void setDetallerecurso(List<DetalleRecurso> detallerecurso) {
        this.detallerecurso = detallerecurso;
    }
    
   
}