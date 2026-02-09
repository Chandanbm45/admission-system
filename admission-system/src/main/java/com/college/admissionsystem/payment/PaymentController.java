package com.college.admissionsystem.payment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping("/pay")
    public String pay(@RequestParam Double amount) {
        return service.pay(amount);
    }
}
