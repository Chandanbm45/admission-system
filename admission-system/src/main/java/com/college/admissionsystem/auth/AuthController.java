package com.college.admissionsystem.auth;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public String login(@RequestParam String user,
                        @RequestParam String pass) {

        return service.login(user, pass);
    }
}
