package com.example.meyok.service;

import com.example.meyok.model.College;

import java.util.List;

public interface CollegeService {
    void insert(College college);
    List<College> getAllColleges();
    void deleteById(String collegeId);
    College update(College college);
    College getCollegeById(String collegeId);
}
