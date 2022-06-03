package com.example.meyok.service;

import com.example.meyok.model.Expertise;

import java.util.List;

public interface ExpertiseService {
    void insert(Expertise expertise);
    List<Expertise> getAllExpertises();
    void deleteById(String expertiseId);
    Expertise update(Expertise expertise);
    Expertise getExpertiseById(String expertiseId);
}
