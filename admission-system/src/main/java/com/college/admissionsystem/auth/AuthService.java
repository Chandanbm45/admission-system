package com.college.admissionsystem.auth;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository repo;

    public AuthService(UserRepository repo) {
        this.repo = repo;
    }

    public String login(String user, String pass) {

        return repo.findById(user)
                .filter(u -> u.getPassword().equals(pass))
                .map(u -> "Login Success")
                .orElse("Invalid Credentials");
    }
}
