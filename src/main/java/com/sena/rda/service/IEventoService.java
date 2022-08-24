package com.sena.rda.service;

import java.util.List;

import com.sena.rda.model.Evento;

public interface IEventoService {
    public List<Evento> findAll();
    public void save(Evento evento);
    public Evento findOne(Integer id);
    public void delete(Integer id);
}
