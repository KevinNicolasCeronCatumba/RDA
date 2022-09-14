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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="empresas", uniqueConstraints=@UniqueConstraint(columnNames="nitEmp"))
public class Empresa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idEmp;

    @NotEmpty(message="El campo Nombre es obligatorio")
    @Column(length = 45)
    private String nomEmp;

    @NotNull(message="El campo Nit es obligatorio")
    @Column(unique = true)
    private Integer nitEmp;

    @NotNull(message="El campo Telefono es obligatorio")
    @Column(length = 15)
    private Integer telEmp;

    @NotEmpty(message="El campo Direccion es obligatorio")
    @Column(length = 45)
    private String dirreEmp;

    private Boolean estEmp;

    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Grupo> grupos;

    public Empresa(){
        grupos = new ArrayList<Grupo>();

    }

    public Empresa(Integer idEmp, String nomEmp, Integer nitEmp, Integer telEmp, String dirreEmp, Boolean estEmp) {
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

    public Integer getTelEmp() {
        return telEmp;
    }

    public void setTelEmp(Integer telEmp) {
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

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    
}
