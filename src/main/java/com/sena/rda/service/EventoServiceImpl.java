package com.sena.rda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.rda.model.IEvento;
import com.sena.rda.model.Evento;

@Service
public class EventoServiceImpl implements IEventoService{
    
    @Autowired
    private IEvento evented;

    @Override
    public List<Evento> findAll() {
        return (List<Evento>) evented.findAll();
    }
    @Override
    public void save(Evento evento) {
        evented.save(evento);
    }
    @Override
    public Evento findOne(Integer id) {
        return evented.findById(id).orElse(null);
    }
    @Override
    public void delete(Integer id) {
        evented.deleteById(id);        
    }
}