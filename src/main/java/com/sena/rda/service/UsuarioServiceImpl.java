package com.sena.rda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.rda.model.Usuario;
import com.sena.rda.model.IUsuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private IUsuario usuared;


    @Override
    public void delete(Integer id) {
        usuared.deleteById(id);

    }

    @Override
    public List<Usuario> findAll() {

        return (List<Usuario>) usuared.findAll();
    }

    @Override
    public void save(Usuario a) {
        usuared.save(a);
        
    }

    @Override
    public Usuario findOne(Integer id) {
        return usuared.findById(id).orElse(null);
    }


}
