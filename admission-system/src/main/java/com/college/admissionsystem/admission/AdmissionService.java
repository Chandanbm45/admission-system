package com.college.admissionsystem.admission;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmissionService {

    private final AdmissionRepository repo;

    public AdmissionService(AdmissionRepository repo) {
        this.repo = repo;
    }

    public Admission apply(Admission admission) {
        admission.setStatus("PENDING");
        return repo.save(admission);
    }

    public List<Admission> getAll() {
        return repo.findAll();
    }
}
