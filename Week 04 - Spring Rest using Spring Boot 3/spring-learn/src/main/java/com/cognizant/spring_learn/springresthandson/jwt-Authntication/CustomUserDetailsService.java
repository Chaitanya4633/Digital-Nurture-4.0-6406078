package com.cognizant.spring_learn.springresthandson.step5;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CustomUserDetailsService implements UserDetailsService 
{
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("chaitu".equals(username)) 
        {
            return new User("chaitu","cognizant",new ArrayList<>());
        } 
        else
        {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
