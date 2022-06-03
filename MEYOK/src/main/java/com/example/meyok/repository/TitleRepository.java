package com.example.meyok.repository;

import com.example.meyok.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TitleRepository extends JpaRepository<Title,String> {
    Optional<Title> findTitleById(String titleId);

}
