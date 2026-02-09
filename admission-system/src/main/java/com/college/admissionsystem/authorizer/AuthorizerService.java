package com.college.admissionsystem.authorizer;

import org.springframework.stereotype.Service;

@Service
public class AuthorizerService {

    public boolean approve(String role) {

        return role.equalsIgnoreCase("ADMIN");
    }
}
