package com.clinic.service;

import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;

@Service
public class TokenService {

    @Value("${jwt.secret}")
    private String secret;

    public String generateToken(String email) {
        return "JWT_TOKEN_FOR_" + email;
    }

    public SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }
}