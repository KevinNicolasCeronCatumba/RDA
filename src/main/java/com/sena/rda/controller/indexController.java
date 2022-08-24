package com.sena.rda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
    @GetMapping(path = {"/index","/",""})
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("index");
        return mv;
    }
}
