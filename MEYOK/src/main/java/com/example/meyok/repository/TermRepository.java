package com.example.meyok.repository;

import com.example.meyok.model.Term;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TermRepository extends JpaRepository<Term,String> {
    Optional<Term> findTermById(String termId);
}
