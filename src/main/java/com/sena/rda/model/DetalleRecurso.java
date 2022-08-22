package com.sena.rda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detallerecurso")
public class DetalleRecurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer idDetalleRecurso;

    @ManyToOne(fetch = FetchType.LAZY)
    public Recurso recurso;

    @ManyToOne(fetch = FetchType.LAZY)
    private Evento evento;
}
