package com.alunoweb.cource.resources;

import com.alunoweb.cource.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Thalita", "sribeiro.thalita@gmail.com", "(11) 981945893", "123");
        return ResponseEntity.ok().body(user);
    }
}