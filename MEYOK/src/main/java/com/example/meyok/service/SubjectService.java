package com.example.meyok.service;

import com.example.meyok.model.Subject;

import java.util.List;

public interface SubjectService {
    void insert(Subject subject);
    List<Subject> getAllSubjects();
    void deleteById(String subjectId);
    Subject update(Subject subject);
    Subject getSubjectById(String subjectId);
}
