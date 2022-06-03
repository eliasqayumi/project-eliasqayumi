package com.example.meyok.service;

import com.example.meyok.model.CollegeEmployee;

import java.util.List;

public interface CollegeEmployeeService {
    void insert(CollegeEmployee collegeEmployee);
    List<CollegeEmployee> getAllCollegeEmployee();
    void deleteById(String collegeEmployeeId);
    CollegeEmployee update(CollegeEmployee collegeEmployee);
    CollegeEmployee getCollegeEmployeeById(String collegeEmployeeId);
}
