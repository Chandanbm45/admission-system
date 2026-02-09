package com.college.admissionsystem.admission;

import jakarta.persistence.*;

@Entity
@Table(name = "admissions")
public class Admission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;

    private String course;

    private String status;

    // ✅ No-arg constructor (Required by JPA)
    public Admission() {
    }

    // ✅ Parameterized constructor
    public Admission(String studentName, String course, String status) {
        this.studentName = studentName;
        this.course = course;
        this.status = status;
    }

    // ✅ Getters & Setters

    public Long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStatus() {      // <-- REQUIRED
        return status;
    }

    public void setStatus(String status) {   // <-- THIS FIXES ERROR
        this.status = status;
    }
}
