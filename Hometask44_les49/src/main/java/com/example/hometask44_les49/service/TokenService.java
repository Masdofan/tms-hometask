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
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TokenService {

//    @Value("${project.secretkey") почему то не хотел сеттатся и код падал ввиду отсутствия ключа, заработало только когда за хардкодил
    private String secret = "safds0iasguhdf8ughauygsdtf6643t6awegrfydtsgbf6tge62g236bgdsbfv4t632fbvygdewvbf67t4v2fhdbgta63bugbt463";
    private SecretKey secretKey;

    @PostConstruct
    public void init() {
        secretKey = Keys.hmacShaKeyFor(secret.getBytes());
    }

    public String createToken(UserDetails userDetails) {

        var username = userDetails.getUsername();
        var authorities = userDetails.getAuthorities();

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
                .setSigningKey(secretKey)
                .build();

        Claims payload = parser.parseClaimsJws(token).getPayload();

        Object login = payload.get("login");
        String roles = (String)payload.get("roles");

        List<SimpleGrantedAuthority> collect = Arrays.stream(roles.split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        return new UsernamePasswordAuthenticationToken(login, null, null);
    }

}
