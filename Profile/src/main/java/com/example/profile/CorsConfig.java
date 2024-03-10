package com.example.profile;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Permitir todos los orígenes
                .allowedMethods("*") // Permitir todos los métodos HTTP
                .allowedHeaders("*"); // Permitir todos los encabezados
    }
}