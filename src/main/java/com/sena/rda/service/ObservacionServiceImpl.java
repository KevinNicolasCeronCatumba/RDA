package com.sena.rda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.rda.model.IObservacion;
import com.sena.rda.model.Observacion;

@Service
public class ObservacionServiceImpl implements IObservacionService{
    
    @Autowired
    private IObservacion observed;

    @Override
    public List<Observacion> findAll() {
        return (List<Observacion>) observed.findAll();
    }
    @Override
    public void save(Observacion observacion) {
        observed.save(observacion);
    }
    @Override
    public Observacion findOne(Integer id) {
        return observed.findById(id).orElse(null);
    }
    @Override
    public void delete(Integer id) {
        observed.deleteById(id);        
    }
}