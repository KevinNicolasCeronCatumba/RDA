package com.sena.rda.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
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
@Table(name="eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idEve;

    @NotEmpty
    @Column(name = "idUsuario", length = 20, nullable = false)
    public Integer idUsuario;

    @NotEmpty
    @Column(name = "idTer", length = 20, nullable = false)
    public Integer idTer;

    
    @NotEmpty
    @Column(name = "Fecha", length = 20, nullable = false)
    public Date Fecha;

    
    @NotEmpty
    @Column(name = "HoraI", length = 20, nullable = false)
    public Time HoraI;

    
    @NotEmpty
    @Column(name = "HoraF", length = 20, nullable = false)
    public Time HoraF;

    
    @NotEmpty
    @Column(name = "Reporte", length = 20, nullable = false)
    public String Reporte;

    
    @NotEmpty
    @Column(name = "NumArboles", length = 20, nullable = false)
    public Integer NumArboles;

    
    @NotEmpty
    @Column(name = "TipoEve", length = 20, nullable = false)
    public Integer TipoEve;

    
    @NotEmpty
    @Column(name = "Observ", length = 20, nullable = false)
    public String Observ;

    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Observacion> observacion;

    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Voluntario> voluntario;
/**
     * 
     */
    
    public Evento(){
    }


    public Evento(Integer idEve, Integer idUsuario, Integer idTer, Date Fecha, Time HoraI, Time HoraF, String Reporte,Integer NumArboles,Integer TipoEve,String Observ) {
        this.idEve = idEve;
        this.idUsuario = idUsuario;
        this.idTer = idTer;
        this.Fecha = Fecha;
        this.HoraI = HoraI;
        this.HoraF = HoraF;
        this.Reporte = Reporte;
        this.NumArboles = NumArboles;
        this.Observ = Observ;
    }


    public Integer getIdEve() {
        return idEve;
    }


    public void setIdEve(Integer idEve) {
        this.idEve = idEve;
    }


    public Integer getIdUsuario() {
        return idUsuario;
    }


    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }


    public Integer getIdTer() {
        return idTer;
    }


    public void setIdTer(Integer idTer) {
        this.idTer = idTer;
    }


    public Date getFecha() {
        return Fecha;
    }


    public void setFecha(Date fecha) {
        Fecha = fecha;
    }


    public Time getHoraI() {
        return HoraI;
    }


    public void setHoraI(Time horaI) {
        HoraI = horaI;
    }


    public Time getHoraF() {
        return HoraF;
    }


    public void setHoraF(Time horaF) {
        HoraF = horaF;
    }


    public String getReporte() {
        return Reporte;
    }


    public void setReporte(String reporte) {
        Reporte = reporte;
    }


    public Integer getNumArboles() {
        return NumArboles;
    }


    public void setNumArboles(Integer numArboles) {
        NumArboles = numArboles;
    }


    public Integer getTipoEve() {
        return TipoEve;
    }


    public void setTipoEve(Integer tipoEve) {
        TipoEve = tipoEve;
    }


    public String getObserv() {
        return Observ;
    }


    public void setObserv(String observ) {
        Observ = observ;
    }
    

    
}
