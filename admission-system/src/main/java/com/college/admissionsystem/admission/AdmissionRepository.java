package com.college.admissionsystem.admission;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionRepository
        extends JpaRepository<Admission, Long> {
}
