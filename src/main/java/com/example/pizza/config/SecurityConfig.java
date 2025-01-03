package com.example.pizza.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.cors().and() // CORS'u etkinleştir
                .csrf().disable() // CSRF'yi devre dışı bırak
                .authorizeRequests()
                .requestMatchers(HttpMethod.POST, "/api/orders").permitAll() // API'ye tüm kullanıcıların erişmesini sağla
                .anyRequest().authenticated(); // Diğer istekler için kimlik doğrulama
        return http.build();
    }
}
