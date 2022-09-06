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

import com.sena.rda.model.Voluntario;
import com.sena.rda.service.IVoluntarioService;

@Controller
@SessionAttributes("voluntario")
@RequestMapping("/voluntario")

public class voluntarioController {

        @Autowired
        private IVoluntarioService voluntared;
    
    
        @GetMapping(path = {"/list","","/"})
        public String lista(Model m){
            m.addAttribute("voluntarios", voluntared.findAll());
            return "voluntario/list";
        }
       @GetMapping("/añadir")
       public String formulario(Model m) {
           Voluntario voluntario = new Voluntario();
           m.addAttribute("voluntario", voluntario);
           m.addAttribute("accion", "Agregar Voluntario");
           return "voluntario/form";
       }
    
        @PostMapping(path ="/form")
        public String list(@Valid Voluntario voluntario, BindingResult res, Model m, SessionStatus status){
        if(res.hasErrors()){
            return "voluntario/form";
        }
        voluntared.save(voluntario);
        status.setComplete();
        return "redirect:list";
        }
    
        @GetMapping("/editar/{id}")
        public String editar(@PathVariable Integer id, Model m){
            Voluntario voluntario= null;
            if(id>0){
                voluntario=voluntared.findOne(id);
            }
            else{
                return "redirect:list";
            }
            m.addAttribute("voluntario", voluntario);    
    
            m.addAttribute("accion", "editar");
            return "voluntario/form";
        }
    
        @GetMapping("/delete/{id}")
        public String delete(@PathVariable Integer id){
            if(id > 0){
                voluntared.delete(id);
            }
            return "redirect:../list";
        }
}