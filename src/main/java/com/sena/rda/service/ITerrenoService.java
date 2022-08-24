package com.sena.rda.service;

import java.util.List;

import com.sena.rda.model.Terreno;

public interface ITerrenoService {
    public List<Terreno> findAll();
    public void save(Terreno terreno);
    public Terreno findOne(Integer id);
    public void delete(Integer id);
}
