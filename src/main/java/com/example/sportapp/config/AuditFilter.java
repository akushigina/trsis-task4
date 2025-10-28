package com.example.sportapp.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class AuditFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String user = req.getUserPrincipal() != null ? req.getUserPrincipal().getName() : "Anonymous";
        String path = req.getRequestURI();
        String method = req.getMethod();

        System.out.println("Аудит доступа: Пользователь = " + user + ", Метод = " + method + ", Путь = " + path);

        chain.doFilter(request, response);
    }
}