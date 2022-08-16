    package com.sena.rda.service;

import java.util.List;

import com.sena.rda.model.Usuario;
    
    public interface IUsuarioService {
        public List<Usuario> findAll();
        public void save(Usuario a);
        public Usuario findOne(Integer id);
        public void delete(Integer id);
    }