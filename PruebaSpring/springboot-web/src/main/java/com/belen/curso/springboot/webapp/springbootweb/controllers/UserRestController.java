package com.belen.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belen.curso.springboot.webapp.springbootweb.models.User;
import com.belen.curso.springboot.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        UserDto userDto = new UserDto();
        User user = new User("Belen", "Roman");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");

        return userDto;
    }
        @GetMapping("/details-map")
        public Map<String, Object> detailsMap() {
            User user = new User("Belen", "Roman");
            Map<String, Object> body = new HashMap<>();
    
            body.put("title", "Hola Mundo Spring Boot");
            body.put("user", user);
            return body;

    }
}
