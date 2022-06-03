package com.example.meyok.repository;

import com.example.meyok.model.CollegeDepartmentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeDepartmentSubjectRepository extends JpaRepository<CollegeDepartmentSubject,String> {
    Optional<CollegeDepartmentSubject> findCollegeDepartmentSubjectById(String collegeDepartmentSubjectId);
}
