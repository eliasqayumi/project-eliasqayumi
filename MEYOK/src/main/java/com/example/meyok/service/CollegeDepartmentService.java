package com.example.meyok.service;

import com.example.meyok.model.CollegeDepartment;

import java.util.List;

public interface CollegeDepartmentService {
    void insert(CollegeDepartment CollegeDepartment);
    List<CollegeDepartment> getAllCollegeDepartment();
    void deleteById(String collegeDepartmentId);
    CollegeDepartment update(CollegeDepartment collegeDepartment);
    CollegeDepartment getCollegeDepartmentById(String collegeDepartmentId);
}
