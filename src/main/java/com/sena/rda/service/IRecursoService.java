package com.sena.rda.service;

import java.util.List;

import com.sena.rda.model.Recurso;
    
    public interface IRecursoService {
        public List<Recurso> findAll();
        public void save(Recurso a);
        public Recurso findOne(Integer id);
        public void delete(Integer id);
    }