package com.cognizant.spring_learn.springresthandson.step5;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.function.Function;

@Component
public class JwtUtil 
{

    private final Key SECRET_KEY=Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public String generateToken(String username) 
    {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) 
                .signWith(SECRET_KEY)
                .compact();
    }

    public String extractUsername(String token) 
    {
        return extractClaim(token,Claims::getSubject);
    }

    public <T> T extractClaim(String token,Function<Claims, T> claimsResolver) 
    {
        final Claims claims = Jwts.parserBuilder().setSigningKey(SECRET_KEY).build().parseClaimsJws(token).getBody();
        return claimsResolver.apply(claims);
    }

    public boolean validateToken(String token, String username) 
    {
        return extractUsername(token).equals(username);
    }
}
