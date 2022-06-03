package com.example.meyok.service;

import com.example.meyok.model.CollegeDepartmentEmployeesTeachSubject;
import com.example.meyok.model.CollegeDepartmentEmployeesTeachSubjectId;

import java.util.List;

public interface CollegeDepartmentEmployeesTeachSubjectService {
    void insert(CollegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject);
    List<CollegeDepartmentEmployeesTeachSubject> getAllCollegeDepartmentEmployeesTeachSubject();
    void deleteById(String collegeDepartmentEmployeesTeachSubjectId);
    CollegeDepartmentEmployeesTeachSubject update(CollegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject);
    CollegeDepartmentEmployeesTeachSubject getCollegeDepartmentEmployeesTeachSubjectById(String collegeDepartmentEmployeesTeachSubjectId);
}
