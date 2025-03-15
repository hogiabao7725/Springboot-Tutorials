package com.hgb7725.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/user")
    public User getUser() {
        return new User(1, "Gia Bao", "giabao@gmail.com");
    }
}

class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters & Setters (Bắt buộc để Spring Boot chuyển đổi thành JSON)
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}
