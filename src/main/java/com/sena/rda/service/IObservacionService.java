package com.sena.rda.service;

import java.util.List;

import com.sena.rda.model.Observacion;
    
    public interface IObservacionService {
        public List<Observacion> findAll();
        public void save(Observacion a);
        public Observacion findOne(Integer id);
        public void delete(Integer id);
    }