package com.example.hometask42_les47.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(cust -> {
            cust
                    .requestMatchers("/public").permitAll()
                    .requestMatchers("/authusers").authenticated()
                    .requestMatchers("/accessonly").hasAuthority("access");
        });

        http.httpBasic(Customizer.withDefaults());

        return http.build();
    }
    @Bean
    public UserDetailsManager userDetailsManager() {

        UserDetails userDetails1 = User.builder()
                .username("user1").password("pass1").build();

        UserDetails userDetails2 = User.builder()
                .username("user2").password("pass2").authorities("access").build();

        return new InMemoryUserDetailsManager(userDetails1, userDetails2);

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
