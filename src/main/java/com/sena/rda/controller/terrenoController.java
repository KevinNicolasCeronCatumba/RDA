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

import com.sena.rda.model.Terreno;
import com.sena.rda.service.ITerrenoService;

@Controller
@SessionAttributes("terreno")
@RequestMapping("/terreno")
public class terrenoController {

    @Autowired
    private ITerrenoService iterreno;

    @GetMapping(path={"/listar","","/"})
    public String listgen(Model m){
        m.addAttribute("terrenos", iterreno.findAll());
        Terreno terreno = new Terreno();
        m.addAttribute("terreno" , terreno);
        m.addAttribute("accion" , "Agregar nuevo terreno");
        return "terreno/terreno";
    }
    /*@GetMapping("/add")
    public String add(Model m){
        Terreno terreno = new Terreno();
        m.addAttribute("terreno" , terreno);
        m.addAttribute("accion" , "Agregar nuevo terreno");
        return "terreno/add";
    } */
    @PostMapping("/addter")
    public String add(@Valid Terreno terreno,BindingResult res, Model m, SessionStatus status){
        if(res.hasErrors()){
            m.addAttribute("terrenos", iterreno.findAll());
            m.addAttribute("accion" , "Agregar nuevo Terreno");
            m.addAttribute("error" , "No se pudo agregar el nuevo terreno");
            return "terreno/terreno";      
        } 
        iterreno.save(terreno);
        status.setComplete();
        return "redirect:listar";
    } 
    @PostMapping("/udpter")
    public String upd(@Valid Terreno terreno,BindingResult res, Model m, SessionStatus status){
        if(res.hasErrors()){
            m.addAttribute("accion" , "Modificar el terreno");
            return "terreno/add";      
        }
        iterreno.save(terreno);
        status.setComplete();
        return "redirect:listar";
    }  
    
    @GetMapping("/listid/{id}")  
    public String listid(@PathVariable Integer id, Model m){
        Terreno terreno = null;
        if(id>0){
            terreno = iterreno.findOne(id);
        }
        else {
            return "redirect:listar";
        }
        m.addAttribute("terreno", terreno);
        m.addAttribute("accion" , "Modificar el terreno");
        return "terreno/add";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        if(id>0){
            iterreno.delete(id);
        }
        return "redirect:../listar";
    }
}
