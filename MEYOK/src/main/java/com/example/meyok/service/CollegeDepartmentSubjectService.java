package com.example.meyok.service;

import com.example.meyok.model.CollegeDepartmentSubject;

import java.util.List;

public interface CollegeDepartmentSubjectService {
    void insert(CollegeDepartmentSubject collegeDepartmentSubject);
    List<CollegeDepartmentSubject> getAllCollegeDepartmentSubject();
    void deleteById(String collegeDepartmentSubjectId);
    CollegeDepartmentSubject update(CollegeDepartmentSubject collegeDepartmentSubject);
    CollegeDepartmentSubject getCollegeDepartmentSubjectById(String collegeDepartmentSubjectId);
}
