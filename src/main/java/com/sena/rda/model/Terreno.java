package com.sena.rda.model;

import java.util.ArrayList;
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

@Entity
@Table(name="terrenos")
public class Terreno {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idTer;

    @Column(length = 45)
    private String nomTer;

    @Column(length = 30)
    private String ciudadTer;

    @Column(length = 500)
    private String descTer;

    private Integer extensionTer;

    private Integer terDispTer;

    @Column(length = 30)
    private String tipTer;

    private Boolean estTer;
    @OneToMany(mappedBy = "terreno", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Evento> eventos;
    public Terreno(){
       eventos = new ArrayList<Evento>();
    }

    public Terreno(Integer idTer, String nomTer, String ciudadTer, String descTer, Integer extensionTer,
            Integer terDispTer, String tipTer, Boolean estTer) {
        this.idTer = idTer;
        this.nomTer = nomTer;
        this.ciudadTer = ciudadTer;
        this.descTer = descTer;
        this.extensionTer = extensionTer;
        this.terDispTer = terDispTer;
        this.tipTer = tipTer;
        this.estTer = estTer;
    }

    public Integer getIdTer() {
        return idTer;
    }

    public void setIdTer(Integer idTer) {
        this.idTer = idTer;
    }

    public String getCiudadTer() {
        return ciudadTer;
    }

    public void setCiudadTer(String ciudadTer) {
        this.ciudadTer = ciudadTer;
    }

    public String getNomTer() {
        return nomTer;
    }

    public void setNomTer(String nomTer) {
        this.nomTer = nomTer;
    }

    public String getDescTer() {
        return descTer;
    }

    public void setDescTer(String descTer) {
        this.descTer = descTer;
    }

    public Integer getExtensionTer() {
        return extensionTer;
    }

    public void setExtensionTer(Integer extensionTer) {
        this.extensionTer = extensionTer;
    }

    public Integer getTerDispTer() {
        return terDispTer;
    }

    public void setTerDispTer(Integer terDispTer) {
        this.terDispTer = terDispTer;
    }

    public String getTipTer() {
        return tipTer;
    }

    public void setTipTer(String tipTer) {
        this.tipTer = tipTer;
    }

    public Boolean getEstTer() {
        return estTer;
    }

    public void setEstTer(Boolean estTer) {
        this.estTer = estTer;
    }
    
    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
     
}
