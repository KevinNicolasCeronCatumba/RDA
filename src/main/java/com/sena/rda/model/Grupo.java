package com.sena.rda.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="grupos")
public class Grupo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idGru;

    private Integer asistenciaGru;

    private Integer cantGru;

    @ManyToOne(fetch = FetchType.LAZY)
    private Empresa empresa;

    @ManyToOne(fetch = FetchType.LAZY)
    private Evento evento;

    @OneToMany(mappedBy = "grupo", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Asistencia> asistencia;

    public Grupo(){
        asistencia = new ArrayList<Asistencia>();
    }
    
    public Grupo(Integer idGru, Integer asistenciaGru, Integer cantGru, Empresa empresa, Evento evento) {
        this.idGru = idGru;
        this.asistenciaGru = asistenciaGru;
        this.cantGru = cantGru;
        this.empresa = empresa;
        this.evento = evento;
    }

    public Integer getIdGru() {
        return idGru;
    }

    public void setIdGru(Integer idGru) {
        this.idGru = idGru;
    }

    public Integer getAsistenciaGru() {
        return asistenciaGru;
    }

    public void setAsistenciaGru(Integer asistenciaGru) {
        this.asistenciaGru = asistenciaGru;
    }

    public Integer getCantGru() {
        return cantGru;
    }

    public void setCantGru(Integer cantGru) {
        this.cantGru = cantGru;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Asistencia> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(List<Asistencia> asistencia) {
        this.asistencia = asistencia;
    }
}
