package com.example.pizza.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // API'nin hangi endpoint'leri için geçerli olacak
                .allowedOrigins("http://localhost:5174") // React frontend'inizin adresi
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Hangi metodlara izin verileceği
                .allowedHeaders("*") // Tüm header'lara izin verileceği
                .allowCredentials(true); // Kimlik doğrulama bilgilerini gönderme izni
    }
}
