package com.sena.rda.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idAsi;

    @ManyToOne(fetch = FetchType.LAZY)
    private Grupo grupo;

    private Boolean asistencia;

    private Date fecAsi;

    @ManyToOne(fetch = FetchType.LAZY)
    private Voluntario voluntario;

    public Asistencia(){
        
    }

    public Asistencia(Integer idAsi, Grupo grupo, Boolean asistencia, Date fecAsi, Voluntario voluntario) {
        this.idAsi = idAsi;
        this.grupo = grupo;
        this.asistencia = asistencia;
        this.fecAsi = fecAsi;
        this.voluntario = voluntario;
    }

    public Integer getIdAsi() {
        return idAsi;
    }

    public void setIdAsi(Integer idAsi) {
        this.idAsi = idAsi;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Boolean getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Boolean asistencia) {
        this.asistencia = asistencia;
    }

    public Date getFecAsi() {
        return fecAsi;
    }

    public void setFecAsi(Date fecAsi) {
        this.fecAsi = fecAsi;
    }

    public Voluntario getVoluntario() {
        return voluntario;
    }

    public void setVoluntario(Voluntario voluntario) {
        this.voluntario = voluntario;
    }

    
}
