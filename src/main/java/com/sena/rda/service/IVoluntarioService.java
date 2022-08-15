package com.sena.rda.service;

import java.util.List;

import com.sena.rda.model.Voluntario;
    
    public interface IVoluntarioService {
        public List<Voluntario> findAll();
        public void save(Voluntario a);
        public Voluntario findOne(Integer id);
        public void delete(Integer id);
    }

