package com.example.meyok.repository;

import com.example.meyok.model.CollegeDepartmentEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeDepartmentEmployeeRepository extends JpaRepository<CollegeDepartmentEmployee,String> {
    Optional<CollegeDepartmentEmployee> findCollegeDepartmentEmployeeById(String collegeDepartmentEmployeeId);

}
