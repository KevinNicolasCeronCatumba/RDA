package com.sena.rda.model;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idEve;
    
    @Column(nullable = false)
    public Date fechaEve;

    @Column(nullable = false)
    public Time horaIniEve;

    @Column(nullable = false)
    public Time horaFinEve;

    @Column(length = 200, nullable = false)
    public String ReporteEve;

    @Column(nullable = false)
    public Integer numArbEve;

    @Column(nullable = false)
    public Integer TipEve;

    @Column(length = 50, nullable = false)
    public String ObsEve;

    @ManyToOne(fetch = FetchType.LAZY)
    private Terreno terreno;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    
    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Grupo> grupos;

    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<DetalleRecurso> detallerecurso;
    
    public Evento(){

    }

    public Evento(Integer idEve, Date fechaEve, Time horaIniEve, Time horaFinEve, String reporteEve, Integer numArbEve,
            Integer tipEve, String obsEve, Terreno terreno, Usuario usuario, List<Grupo> grupos,
            List<DetalleRecurso> detallerecurso) {
        this.idEve = idEve;
        this.fechaEve = fechaEve;
        this.horaIniEve = horaIniEve;
        this.horaFinEve = horaFinEve;
        ReporteEve = reporteEve;
        this.numArbEve = numArbEve;
        TipEve = tipEve;
        ObsEve = obsEve;
        this.terreno = terreno;
        this.usuario = usuario;
        this.grupos = grupos;
        this.detallerecurso = detallerecurso;
    }

    public Integer getIdEve() {
        return idEve;
    }

    public void setIdEve(Integer idEve) {
        this.idEve = idEve;
    }

    public Date getFechaEve() {
        return fechaEve;
    }

    public void setFechaEve(Date fechaEve) {
        this.fechaEve = fechaEve;
    }

    public Time getHoraIniEve() {
        return horaIniEve;
    }

    public void setHoraIniEve(Time horaIniEve) {
        this.horaIniEve = horaIniEve;
    }

    public Time getHoraFinEve() {
        return horaFinEve;
    }

    public void setHoraFinEve(Time horaFinEve) {
        this.horaFinEve = horaFinEve;
    }

    public String getReporteEve() {
        return ReporteEve;
    }

    public void setReporteEve(String reporteEve) {
        ReporteEve = reporteEve;
    }

    public Integer getNumArbEve() {
        return numArbEve;
    }

    public void setNumArbEve(Integer numArbEve) {
        this.numArbEve = numArbEve;
    }

    public Integer getTipEve() {
        return TipEve;
    }

    public void setTipEve(Integer tipEve) {
        TipEve = tipEve;
    }

    public String getObsEve() {
        return ObsEve;
    }

    public void setObsEve(String obsEve) {
        ObsEve = obsEve;
    }

    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<DetalleRecurso> getDetallerecurso() {
        return detallerecurso;
    }

    public void setDetallerecurso(List<DetalleRecurso> detallerecurso) {
        this.detallerecurso = detallerecurso;
    }  
    
}
