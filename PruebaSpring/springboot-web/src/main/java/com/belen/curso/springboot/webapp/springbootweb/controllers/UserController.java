package com.belen.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

import com.belen.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Belen", "Roman");
        user.setEmail("belen@correo.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";

    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(new User("Pablo","Herrera"), 
        new User("Viridiana", "Sanchez", "viri@correo.com"), 
        new User("Aldo", "Perez", "aldo@correo.com"),
        new User("Andres", "Doe"));

        model.addAttribute("users", users);
        model.addAttribute("title","Listado de usuarios!");
        return "list";
    }
}
