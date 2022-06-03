package com.example.meyok.repository;

import com.example.meyok.model.DepartmentStudents;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentStudentsRepository extends JpaRepository<DepartmentStudents,String> {
    Optional<DepartmentStudents> findDepartmentStudentsById(String departmentStudentsId);

}
