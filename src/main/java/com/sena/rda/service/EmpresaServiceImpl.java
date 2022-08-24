package com.sena.rda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.rda.model.IEmpresa;
import com.sena.rda.model.Empresa;

@Service
public class EmpresaServiceImpl implements IEmpresaService{
    
    @Autowired
    private IEmpresa iempresa;

    @Override
    public List<Empresa> findAll() {
        return (List<Empresa>) iempresa.findAll();
    }
    @Override
    public void save(Empresa empresa) {
        iempresa.save(empresa);
    }
    @Override
    public Empresa findOne(Integer id) {
        return iempresa.findById(id).orElse(null);
    }
    @Override
    public void delete(Integer id) {
        iempresa.deleteById(id);        
    }
}