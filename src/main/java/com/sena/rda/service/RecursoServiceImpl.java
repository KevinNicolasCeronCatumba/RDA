package com.sena.rda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.rda.model.Recurso;
import com.sena.rda.model.IRecurso;

@Service
public class RecursoServiceImpl implements IRecursoService{

    @Autowired
    private IRecurso recursoed;


    @Override
    public void delete(Integer id) {
        recursoed.deleteById(id);

    }

    @Override
    public List<Recurso> findAll() {

        return (List<Recurso>) recursoed.findAll();
    }

    @Override
    public void save(Recurso a) {
        recursoed.save(a);
        
    }

    @Override
    public Recurso findOne(Integer id) {
        return recursoed.findById(id).orElse(null);
    }


}
