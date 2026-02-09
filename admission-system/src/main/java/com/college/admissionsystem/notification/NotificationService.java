package com.college.admissionsystem.notification;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void send(String msg) {
        System.out.println("NOTIFICATION: " + msg);
    }
}
