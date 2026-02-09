package com.college.admissionsystem.admission;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admission")
@CrossOrigin
public class AdmissionController {

    private final AdmissionService service;

    public AdmissionController(AdmissionService service) {
        this.service = service;
    }

    @PostMapping("/apply")
    public Admission apply(@RequestBody Admission admission) {
        return service.apply(admission);
    }

    @GetMapping("/all")
    public List<Admission> getAll() {
        return service.getAll();
    }
}
