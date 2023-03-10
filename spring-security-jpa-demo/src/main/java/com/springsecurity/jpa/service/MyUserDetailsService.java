package com.springsecurity.jpa.service;

import com.springsecurity.jpa.repository.UserRepository;
import com.springsecurity.jpa.entity.User;
import com.springsecurity.jpa.model.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user=userRepository.findByUserName(userName);
        user.orElseThrow(()->new UsernameNotFoundException("Not Found: "+userName));
        return user.map(MyUserDetails::new).get();
    }

}
