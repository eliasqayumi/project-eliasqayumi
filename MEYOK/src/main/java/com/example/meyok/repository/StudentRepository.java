package com.example.meyok.repository;

import com.example.meyok.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
    Optional<Student> findStudentById(String studentId);
}
