package com.example.meyok.repository;

import com.example.meyok.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,String> {
    Optional<Department> findDepartmentById(String departmentID);
}
