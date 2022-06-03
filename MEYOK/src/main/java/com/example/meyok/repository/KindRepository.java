package com.example.meyok.repository;

import com.example.meyok.model.Kind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KindRepository extends JpaRepository<Kind,String> {
    Optional<Kind> findKindById(String kindId);
}
