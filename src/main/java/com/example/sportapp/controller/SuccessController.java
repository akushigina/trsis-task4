package com.example.sportapp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuccessController {

    @GetMapping("/success")
    public String handleSuccess(Authentication authentication) {
        // Проверяем роль пользователя
        if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
            return "redirect:/admin/dashboard"; // Админ попадает в админку
        } else {
            return "redirect:/"; // Обычный пользователь на главную
        }
    }
}