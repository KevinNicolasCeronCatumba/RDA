package com.sena.rda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresas")
public class Empresa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idEmp;

    @Column(length = 45)
    private String nomEmp;

    private Integer nitEmp;

    @Column(length = 15)
    private String telEmp;

    @Column(length = 45)
    private String dirreEmp;

    private Boolean estEmp;

    public Empresa(){

    }

    public Empresa(Integer idEmp, String nomEmp, Integer nitEmp, String telEmp, String dirreEmp, Boolean estEmp) {
        this.idEmp = idEmp;
        this.nomEmp = nomEmp;
        this.nitEmp = nitEmp;
        this.telEmp = telEmp;
        this.dirreEmp = dirreEmp;
        this.estEmp = estEmp;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public Integer getNitEmp() {
        return nitEmp;
    }

    public void setNitEmp(Integer nitEmp) {
        this.nitEmp = nitEmp;
    }

    public String getTelEmp() {
        return telEmp;
    }

    public void setTelEmp(String telEmp) {
        this.telEmp = telEmp;
    }

    public String getDirreEmp() {
        return dirreEmp;
    }

    public void setDirreEmp(String dirreEmp) {
        this.dirreEmp = dirreEmp;
    }

    public Boolean getEstEmp() {
        return estEmp;
    }

    public void setEstEmp(Boolean estEmp) {
        this.estEmp = estEmp;
    }

    
    
}
