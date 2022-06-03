package com.example.meyok.service;

import com.example.meyok.model.DepartmentStudents;

import java.util.List;

public interface DepartmentStudentsService {
    void insert(DepartmentStudents departmentStudents);
    List<DepartmentStudents> getAllDepartmentStudents();
    void deleteById(String departmentStudentsId);
    DepartmentStudents update(DepartmentStudents departmentStudents);
    DepartmentStudents getDepartmentStudentsById(String departmentStudentsId);
}
