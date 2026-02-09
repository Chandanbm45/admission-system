package com.college.admissionsystem.notification;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notify")
public class NotificationController {

    private final NotificationService service;

    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @PostMapping("/send")
    public String send(@RequestParam String msg) {

        service.send(msg);
        return "Sent";
    }
}
