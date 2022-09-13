package com.sena.rda.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.sena.rda.model.Observacion;
import com.sena.rda.service.IObservacionService;
import com.sena.rda.validator.ObservacionValidator;

@Controller
@SessionAttributes("observacion")
@RequestMapping("/observacion")

public class observacionController {

    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new ObservacionValidator());
    }

        @Autowired
        private IObservacionService observed;
    
    
        @GetMapping(path = {"/list","","/"})
        public String lista(Model m){
            m.addAttribute("observaciones", observed.findAll());
            return "observacion/list";
        }
     
       @GetMapping("/añadir")
       public String formulario(Model m) {
        Observacion observacion = new Observacion();
           m.addAttribute("observacion", observacion);
           m.addAttribute("accion", "Agregar observacion");
           return "observacion/add";
       }
    
        @PostMapping(path ="/add")
        public String list(@Valid Observacion observacion, BindingResult res, Model m, SessionStatus status){
        if(res.hasErrors()){
            return "observacion/add";
        }
        observed.save(observacion);
        status.setComplete();
        return "redirect:list";
        }
    
        @GetMapping("/editar/{id}")
        public String editar(@PathVariable Integer id, Model m){
            Observacion observacion= null;
            if(id>0){
                observacion=observed.findOne(id);
            }
            else{
                return "redirect:list";
            }
            m.addAttribute("observacion", observacion);    
    
            m.addAttribute("accion", "editar");
            return "observacion/add";
        }
    
        @GetMapping("/delete/{id}")
        public String delete(@PathVariable Integer id){
            if(id > 0){
                observed.delete(id);
            }
            return "redirect:../list";
        }
}