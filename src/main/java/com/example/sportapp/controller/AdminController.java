package com.example.sportapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;

@Controller
public class AdminController {

    @GetMapping("/admin/dashboard")
    public String adminDashboard(Principal principal, Model model) {
        model.addAttribute("username", principal.getName());
        return "admin/dashboard";
    }
}
