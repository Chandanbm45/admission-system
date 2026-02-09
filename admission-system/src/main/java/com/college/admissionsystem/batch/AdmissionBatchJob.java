package com.college.admissionsystem.batch;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AdmissionBatchJob {

    @Scheduled(cron = "0 0 1 * * ?")
    public void process() {

        System.out.println("Batch Running...");
    }
}
