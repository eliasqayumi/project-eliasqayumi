package com.example.meyok.service;

import com.example.meyok.model.Student;

import java.util.List;

public interface StudentService {
    void insert(Student student);
    List<Student> getAllStudents();
    void deleteById(String studentId);
    Student update(Student student);
    Student getStudentById(String studentId);
}
