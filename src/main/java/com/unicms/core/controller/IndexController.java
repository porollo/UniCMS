package com.unicms.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class IndexController {

        @GetMapping("/")
        public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
            model.addAttribute("name", name);

            Path path = Paths.get("/unicms.lock");

            if (Files.exists(path)) {
                return "main";
            }
            else {
                return "install";
            }
        }
    }

