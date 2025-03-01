package com.example.FirstSpringApp.controller;

import ch.qos.logback.classic.Level;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public Level sayHello(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        Level Foo = null;
        return Foo.valueOf("hello"); // Refers to hello.html in templates
    }
}