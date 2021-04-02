/*package com.unicms.core.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.unicms.core.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public User user(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new User(counter.incrementAndGet(),
                String.format(template, name));
    }
}*/
