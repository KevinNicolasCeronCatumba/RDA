package com.sena.rda.service;

import java.util.List;

import com.sena.rda.model.Empresa;

public interface IEmpresaService {
    public List<Empresa> findAll();
    public void save(Empresa empresa);
    public Empresa findOne(Integer id);
    public void delete(Integer id);
}
