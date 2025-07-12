package com.cognizant.spring_learn.springresthandson.step5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class JwtAuthenticationController 
{

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public JwtResponse createToken(@RequestBody JwtRequest request) throws Exception 
    {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );

        final UserDetails userDetails=userDetailsService.loadUserByUsername(request.getUsername());
        final String token=jwtUtil.generateToken(userDetails.getUsername());

        return new JwtResponse(token);
    }
}
