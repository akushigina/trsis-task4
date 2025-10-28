package com.example.sportapp.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<AuditFilter> auditFilter() {
        FilterRegistrationBean<AuditFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new AuditFilter());
        registrationBean.addUrlPatterns("/events/*", "/athletes/*", "/admin/*");
        return registrationBean;
    }
}