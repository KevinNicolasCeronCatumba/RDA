package com.sena.rda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.rda.model.ITerreno;
import com.sena.rda.model.Terreno;

@Service
public class TerrenoServiceImpl implements ITerrenoService{
    
    @Autowired
    private ITerreno iterreno;

    @Override
    public List<Terreno> findAll() {
        return (List<Terreno>) iterreno.findAll();
    }
    @Override
    public void save(Terreno terreno) {
        iterreno.save(terreno);
    }
    @Override
    public Terreno findOne(Integer id) {
        return iterreno.findById(id).orElse(null);
    }
    @Override
    public void delete(Integer id) {
        iterreno.deleteById(id);        
    }
}
