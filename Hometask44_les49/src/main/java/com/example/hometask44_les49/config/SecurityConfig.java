package com.example.hometask44_les49.config;

import com.example.hometask44_les49.config.filters.TokenGenerationFilter;
import com.example.hometask44_les49.config.filters.TokenValidationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.context.SecurityContextHolderFilter;

@Configuration
public class SecurityConfig {

    @Autowired
    private TokenGenerationFilter tokenGenerationFilter;
    @Autowired
    private TokenValidationFilter tokenValidationFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(cust -> {
            cust
                    .requestMatchers("/auth").permitAll()
                    .requestMatchers("/private").hasAuthority("ADMIN");

        });

        http.addFilterAfter(tokenGenerationFilter, LogoutFilter.class);
        http.addFilterBefore(tokenValidationFilter, SecurityContextHolderFilter.class);

        http.cors(AbstractHttpConfigurer::disable);
        http.csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }

}
