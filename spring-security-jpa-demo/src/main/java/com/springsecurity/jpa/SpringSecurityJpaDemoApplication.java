package com.springsecurity.jpa;

import com.springsecurity.jpa.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpaDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJpaDemoApplication.class, args);
    }
}