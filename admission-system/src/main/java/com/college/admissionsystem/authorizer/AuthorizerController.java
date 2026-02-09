package com.college.admissionsystem.authorizer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/authorize")
public class AuthorizerController {

    private final AuthorizerService service;

    public AuthorizerController(AuthorizerService service) {
        this.service = service;
    }

    @GetMapping("/check")
    public boolean check(@RequestParam String role) {

        return service.approve(role);
    }
}
