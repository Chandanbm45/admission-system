-- ============================================
-- Admission System Database Setup
-- Author: Mallikarjun
-- ============================================


-- 1. Create Database
CREATE DATABASE admission_db;

-- Connect to DB (pgAdmin auto-connects)
\c admission_db;


-- ============================================
-- 2. USERS TABLE (Login)
-- ============================================

CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(100),
    role VARCHAR(20)
);

INSERT INTO users(username, password, role)
VALUES
('admin', '123', 'ADMIN'),
('chandan', '123', 'STUDENT'),
('rahul', '123', 'STUDENT'),
('dilip', '123', 'STUDENT'),
('shareef', '123', 'STUDENT'),
('incahra', '123', 'STUDENT'),
('soujanya', '123', 'STUDENT'),
('aman', '123', 'STUDENT');


-- ============================================
-- 3. ADMISSIONS TABLE
-- ============================================

CREATE TABLE admissions (
    id SERIAL PRIMARY KEY,
    student_name VARCHAR(100),
    course VARCHAR(100),
    status VARCHAR(20)
);

INSERT INTO admissions(student_name, course, status)
VALUES
('Chandan B M', 'Java Full Stack', 'PENDING'),
('Rahul', 'Python', 'APPROVED'),
('Dilip', 'Python', 'APPROVED'),
('Shareef', 'Python', 'PENDING'),
('Incahra', 'C#', 'APPROVED'),
('Soujanya', 'C', 'PENDING'),
('Aman', 'AI', 'APPROVED');


-- ============================================
-- 4. PAYMENTS TABLE
-- ============================================

CREATE TABLE payments (
    id SERIAL PRIMARY KEY,
    amount DOUBLE PRECISION,
    status VARCHAR(20)
);

INSERT INTO payments(amount, status)
VALUES
(5000, 'SUCCESS'),
(4000, 'SUCCESS'),
(3500, 'PENDING'),
(6000, 'SUCCESS'),
(3000, 'FAILED'),
(4500, 'PENDING'),
(7000, 'SUCCESS');


-- ============================================
-- 5. NOTIFICATIONS TABLE
-- ============================================

CREATE TABLE notifications (
    id SERIAL PRIMARY KEY,
    message TEXT,
    sent_to VARCHAR(50),
    sent_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO notifications(message, sent_to)
VALUES
('Welcome to Admission System', 'chandan'),
('Your admission approved', 'rahul'),
('Fee payment pending', 'shareef'),
('Course started', 'aman'),
('Profile updated', 'soujanya');


-- ============================================
-- 6. AUTHORIZATIONS TABLE (Admin Approvals)
-- ============================================

CREATE TABLE authorizations (
    id SERIAL PRIMARY KEY,
    student_name VARCHAR(100),
    approved_by VARCHAR(50),
    status VARCHAR(20),
    approved_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO authorizations(student_name, approved_by, status)
VALUES
('Rahul', 'admin', 'APPROVED'),
('Dilip', 'admin', 'APPROVED'),
('Incahra', 'admin', 'APPROVED'),
('Aman', 'admin', 'APPROVED'),
('Chandan B M', 'admin', 'PENDING'),
('Shareef', 'admin', 'PENDING'),
('Soujanya', 'admin', 'PENDING');


-- ============================================
-- 7. VERIFY DATA
-- ============================================

SELECT * FROM users;
SELECT * FROM admissions;
SELECT * FROM payments;
SELECT * FROM notifications;
SELECT * FROM authorizations;


-- ============================================
-- END OF FILE
-- ============================================
