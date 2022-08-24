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
@Table(name="observaciones")
public class Observacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer idObservaciones;

    
    @Column(name = "Descripcion", length = 20, nullable = false)
    public String Descripcion;

    @Column(name = "TipoObservacion", length = 20, nullable = false)
    public Integer TipoObservacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEve")
    public Evento evento;

    public Observacion(){
    }


    public Observacion(Integer idObservaciones, String Descripcion, Integer TipoObservacion ) {
this.idObservaciones = idObservaciones;
this.Descripcion = Descripcion;
this.TipoObservacion = TipoObservacion;

}


    public Integer getIdObservaciones() {
        return idObservaciones;
    }


    public void setIdObservaciones(Integer idObservaciones) {
        this.idObservaciones = idObservaciones;
    }


    public String getDescripcion() {
        return Descripcion;
    }


    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }


    public Integer getTipoObservacion() {
        return TipoObservacion;
    }


    public void setTipoObservacion(Integer tipoObservacion) {
        TipoObservacion = tipoObservacion;
    }



    }