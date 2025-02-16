package com.build.settleup.jwt;


import com.build.settleup.entity.Users;
import com.build.settleup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthUserService implements UserDetailsService {

    @Autowired
    private UserRepository UserRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Users user = UserRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not Found "+ email));
        return User.withUsername(user.getEmail())
                .password(user.getPassword())
//                .roles(user.getRole())
                .build();
    }
}
