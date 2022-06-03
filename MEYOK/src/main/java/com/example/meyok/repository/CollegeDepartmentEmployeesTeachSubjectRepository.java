package com.example.meyok.repository;

import com.example.meyok.model.CollegeDepartmentEmployeesTeachSubject;
import com.example.meyok.model.CollegeDepartmentEmployeesTeachSubjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeDepartmentEmployeesTeachSubjectRepository extends JpaRepository<CollegeDepartmentEmployeesTeachSubject, String> {
    Optional<CollegeDepartmentEmployeesTeachSubject> findCollegeDepartmentEmployeesTeachSubjectById(String collegeDepartmentEmployeesTeachSubjectRepositoryId);
}
