//package com.example.implementtoken1.Security;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .csrf(csrf -> csrf.disable()) // Disable CSRF protection
//            .authorizeHttpRequests(auth -> auth
//                .requestMatchers("/api/**").permitAll() // Permit all requests to this endpoint
//                .anyRequest().authenticated() // Require authentication for other requests
//            );
//
//        return http.build();
//    }
//}
