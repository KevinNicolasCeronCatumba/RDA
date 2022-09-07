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

import com.sena.rda.model.Recurso;
import com.sena.rda.service.IRecursoService;


@Controller
@SessionAttributes("recurso")
@RequestMapping("/recurso")

public class RecursoController {

        @Autowired
        private IRecursoService recursoed;
    
    
        @GetMapping(path = {"/list","","/"})
        public String lista(Model m){
            m.addAttribute("recursos", recursoed.findAll());
            return "recurso/list";
        }
     
       @GetMapping("/añadir")
       public String formulario(Model m) {
           Recurso recurso = new Recurso();
           m.addAttribute("recurso", recurso);
           m.addAttribute("accion", "AGREGAR RECURSO");
           return "recurso/form";
       }
    
        @PostMapping(path ="/form")
        public String list(@Valid Recurso recurso, BindingResult res, Model m, SessionStatus status){
        if(res.hasErrors()){
            return "recurso/form";
        }
        recursoed.save(recurso);
        status.setComplete();
        return "redirect:list";
        }
    
        @GetMapping("/editar/{id}")
        public String editar(@PathVariable Integer id, Model m){
            Recurso recurso= null;
            if(id>0){
                recurso=recursoed.findOne(id);
            }
            else{
                return "redirect:list";
            }
            m.addAttribute("recurso", recurso);    
    
            m.addAttribute("accion", "EDITAR");
            return "recurso/form";
        }
    
        @GetMapping("/delete/{id}")
        public String delete(@PathVariable Integer id){
            if(id > 0){
                recursoed.delete(id);
            }
            return "redirect:../list";
        }
    }
    
