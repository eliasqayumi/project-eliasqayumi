package com.example.meyok.repository;

import com.example.meyok.model.StudentsTakeSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentTakeSubjectRepository extends JpaRepository<StudentsTakeSubject,String> {
    Optional<StudentsTakeSubject> findStudentsTakeSubjectById(String studentTakeSubjectId);
}
