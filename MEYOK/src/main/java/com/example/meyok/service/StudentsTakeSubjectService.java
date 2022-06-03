package com.example.meyok.service;

import com.example.meyok.model.StudentsTakeSubject;

import java.util.List;

public interface StudentsTakeSubjectService {
    void insert(StudentsTakeSubject studentsTakeSubject);
    List<StudentsTakeSubject> getAllStudentsTakeSubject();
    void deleteById(String studentsTakeSubjectId);
    StudentsTakeSubject update(StudentsTakeSubject studentsTakeSubject);
    StudentsTakeSubject getStudentsTakeSubjectById(String studentsTakeSubjectId);
}
