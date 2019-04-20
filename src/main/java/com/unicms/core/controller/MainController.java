package com.unicms.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping (value = "/")

public class MainController {

    @GetMapping
    public ModelAndView getInstallData() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("main");
        return mv;

    }
}

