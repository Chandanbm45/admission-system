package com.college.admissionsystem.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String pay(Double amount) {
        return "Paid ₹" + amount;
    }
}
