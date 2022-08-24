package com.sena.rda.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.sena.rda.model.Empresa;
import com.sena.rda.service.IEmpresaService;

@Controller
@SessionAttributes("empresa")
@RequestMapping("/empresa")
public class empresaController {
    @Autowired
    private IEmpresaService iempresa;

    @GetMapping(path={"/listar","","/"})
    public String listgen(Model m){
        m.addAttribute("empresas", iempresa.findAll());
        return "empresa/empresa";
    }
    
    @GetMapping("/add")
    public String add(Model m){
        Empresa empresa = new Empresa();
        m.addAttribute("empresa" , empresa);
        m.addAttribute("accion" , "Agregar nueva empresa");
        return "empresa/add";
    }
    @PostMapping("/addemp")
    public String add(@Valid Empresa empresa,BindingResult res, Model m, SessionStatus status){
        if(res.hasErrors()){
            m.addAttribute("accion" , "Agregar nueva empresa");
            return "empresa/add";      
        }
        iempresa.save(empresa);
        status.setComplete();
        return "redirect:listar";
    }  
    @GetMapping("/listid/{id}")  
    public String listid(@PathVariable Integer id, Model m){
        Empresa empresa = null;
        if(id>0){
            empresa = iempresa.findOne(id);
        }
        else {
            return "redirect:listar";
        }
        m.addAttribute("empresa", empresa);
        m.addAttribute("accion" , "Modificar la empresa");
        return "empresa/add";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        if(id>0){
            iempresa.delete(id);
        }
        return "redirect:../listar";
    }
}
