package com.agharibi.springsecurityjdbc.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return ("<h2>Welcome to Spring Security JDBC Authentication!</h2>");
    }

    @GetMapping("/user")
    public String userHome() {
        String user = getUser();
        return ("<h2>Welcome " + user + " Spring Security JDBC Authentication!</h2>");
    }

    @GetMapping("/admin")
    public String adminHome() {
        String admin = getUser();
        return ("<h2>Welcome " + admin + " Spring Security JDBC Authentication!</h2>");
    }

    private String getUser() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails.getUsername();
    }
}
