package com.example.hometask44_les49.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class TokenService {

    @Value("${project.secretkey")
    private String secret;
    private SecretKey secretKey;

    @PostConstruct
    public void init() {
        secretKey = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }

    public String createToken(Authentication authentication) {
        var username = authentication.getPrincipal().toString();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        var perms = authorities.stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));

        return Jwts.builder()
                .setSubject(username)
                .claim("login", username)
                .claim("roles", perms)
                .signWith(secretKey)
                .compact();

    }

    public Authentication fromToken(String token) {
        JwtParser parser = Jwts.parser()
                .decryptWith(secretKey)
                .build();

        Claims payload = parser.parseClaimsJws(token).getPayload();

        Object login = payload.get("login");
        Object roles = payload.get("roles");

        return new UsernamePasswordAuthenticationToken(login, null, null);
    }

}
