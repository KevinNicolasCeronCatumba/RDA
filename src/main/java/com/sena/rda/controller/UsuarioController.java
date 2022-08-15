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

import com.sena.rda.model.Usuario;
import com.sena.rda.service.IUsuarioService;


@Controller
@SessionAttributes("usuario")
@RequestMapping("/usuario")

public class UsuarioController {

        @Autowired
        private IUsuarioService usuared;
    
    
        @GetMapping(path = {"/list","","/"})
        public String lista(Model m){
            m.addAttribute("usuarios", usuared.findAll());
            return "usuario/list";
        }
     
       @GetMapping("/añadir")
       public String formulario(Model m) {
           Usuario usuario = new Usuario();
           m.addAttribute("usuario", usuario);
           m.addAttribute("accion", "Agregar Usuario");
           return "usuario/form";
       }
    
        @PostMapping(path ="/form")
        public String list(@Valid Usuario usuario, BindingResult res, Model m, SessionStatus status){
        if(res.hasErrors()){
            return "usuario/form";
        }
        usuared.save(usuario);
        status.setComplete();
        return "redirect:list";
        }
    
        @GetMapping("/editar/{id}")
        public String editar(@PathVariable Integer id, Model m){
            Usuario usuario= null;
            if(id>0){
                usuario=usuared.findOne(id);
            }
            else{
                return "redirect:list";
            }
            m.addAttribute("usuario", usuario);    
    
            m.addAttribute("accion", "editar");
            return "usuario/form";
        }
    
        @GetMapping("/delete/{id}")
        public String delete(@PathVariable Integer id){
            if(id > 0){
                usuared.delete(id);
            }
            return "redirect:../list";
        }
    }
    
