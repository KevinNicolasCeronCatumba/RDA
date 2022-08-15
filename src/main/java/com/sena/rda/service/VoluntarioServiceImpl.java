package com.sena.rda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.rda.model.Voluntario;
import com.sena.rda.model.IVoluntario;


@Service
public class VoluntarioServiceImpl implements IVoluntarioService{

    @Autowired
    private IVoluntario voluntared;


    @Override
    public void delete(Integer id) {
        voluntared.deleteById(id);

    }

    @Override
    public List<Voluntario> findAll() {

        return (List<Voluntario>) voluntared.findAll();
    }

    @Override
    public void save(Voluntario a) {
        voluntared.save(a);
        
    }

    @Override
    public Voluntario findOne(Integer id) {
        return voluntared.findById(id).orElse(null);
    }


}
