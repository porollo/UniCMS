package com.unicms.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/install")

public class InstallController {

    @GetMapping
    public ModelAndView installData() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("install");
        return mv;

    }
}
