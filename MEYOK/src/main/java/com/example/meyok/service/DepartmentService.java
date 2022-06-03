package com.example.meyok.service;

import com.example.meyok.model.Department;

import java.util.List;

public interface DepartmentService {
    void insert(Department department);
    List<Department> getAllDepartment();
    void deleteById(String departmentId);
    Department update(Department department);
    Department getDepartmentById(String departmentId);
}
