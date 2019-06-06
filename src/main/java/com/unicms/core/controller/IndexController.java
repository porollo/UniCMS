package com.unicms.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class IndexController {

        @GetMapping("/")
        public ModelAndView greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
            model.addAttribute("name", name);

            Path path = Paths.get("/unicms.lock");

            if (Files.exists(path)) {
                return new ModelAndView("main");
            }
            else {
                return new ModelAndView("install");
            }
        }
    }

