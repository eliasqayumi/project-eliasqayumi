package com.example.meyok.repository;

import com.example.meyok.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CollegeRepository extends JpaRepository<College,String> {
    Optional<College> findCollegeById(String collegeId);
}
