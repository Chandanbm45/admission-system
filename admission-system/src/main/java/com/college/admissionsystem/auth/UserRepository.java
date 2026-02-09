package com.college.admissionsystem.auth;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, String> {
}
