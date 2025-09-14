package com.mendes.project_spring.resources;

import com.mendes.project_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Samuel", "samuel@gmail.com",  "99999999", "232299001");
        return ResponseEntity.ok().body(u);
    }

}
