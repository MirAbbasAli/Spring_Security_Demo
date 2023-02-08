package com.springsecurity.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    // Root URL should be accessible by everybody
    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome Home</h1>");

    }
    // Only accessible by logged in user, role user
    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");

    }

    // Only accessible by logged in user, role admin
    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }
}
