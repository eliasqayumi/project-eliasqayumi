package com.example.meyok.repository;

import com.example.meyok.model.CollegeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeEmployeeRepository extends JpaRepository<CollegeEmployee,String> {
    Optional<CollegeEmployee> findCollegeEmployeeById(String collegeEmployeeId);
}
