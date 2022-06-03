package com.example.meyok.repository;

import com.example.meyok.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface SubjectRepository extends JpaRepository<Subject,String> {
    Optional<Subject> findSubjectById(String subjectId);
}
