package com.example.meyok.service;

import com.example.meyok.model.CollegeDepartmentEmployee;

import java.util.List;

public interface CollegeDepartmentEmployeeService {
    void insert(CollegeDepartmentEmployee collegeDepartmentEmployee);
    List<CollegeDepartmentEmployee> getAllCollegeDepartmentEmployeeEmployee();
    void deleteById(String collegeDepartmentEmployeeId);
    CollegeDepartmentEmployee update(CollegeDepartmentEmployee collegeDepartmentEmployee);
    CollegeDepartmentEmployee getCollegeDepartmentEmployeeId(String collegeDepartmentEmployeeId);
}
