package com.college.admissionsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AdmissionSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdmissionSystemApplication.class, args);
    }
}



