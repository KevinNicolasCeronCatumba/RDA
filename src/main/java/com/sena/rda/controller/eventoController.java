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

import com.sena.rda.model.Evento;
import com.sena.rda.service.IEventoService;

@Controller
@SessionAttributes("evento")
@RequestMapping("/evento")
public class eventoController {
    @Autowired
    private IEventoService evented;


    @GetMapping(path={"/listar","","/"})
    public String listgen(Model m){
        m.addAttribute("eventos", evented.findAll());
        return "evento/list";
    }
    
    @GetMapping("/addeve")
    public String add(Model m){
        Evento evento = new Evento();
        m.addAttribute("evento" , evento);
        m.addAttribute("accion" , "Agregar nueva evento");
        return "evento/add";
    }
    @PostMapping("/add")
    public String add(@Valid Evento evento,BindingResult res, Model m, SessionStatus status){
        if(res.hasErrors()){
            m.addAttribute("accion" , "Agregar nueva evento");
            return "evento/add";      
        }
        evented.save(evento);
        status.setComplete();
        return "redirect:listar";
    }  
    @GetMapping("/listid/{id}")  
    public String listid(@PathVariable Integer id, Model m){
        Evento evento = null;
        if(id>0){
            evento = evented.findOne(id);
        }
        else {
            return "redirect:listar";
        }
        m.addAttribute("evento", evento);
        m.addAttribute("accion" , "Modificar la evento");
        return "evento/add";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        if(id>0){
            evented.delete(id);
        }
        return "redirect:../listar";
    }
}
