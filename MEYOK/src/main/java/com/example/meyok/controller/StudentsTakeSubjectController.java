package com.example.meyok.controller;

import com.example.meyok.model.StudentsTakeSubject;
import com.example.meyok.serviceImpl.StudentsTakeSubjectServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students/take/subject")
public class StudentsTakeSubjectController {
    private StudentsTakeSubjectServiceImpl studentsTakeSubjectService;

    public StudentsTakeSubjectController(StudentsTakeSubjectServiceImpl studentsTakeSubjectService) {
        this.studentsTakeSubjectService = studentsTakeSubjectService;
    }

    @GetMapping
    public List<StudentsTakeSubject> getAllStudentsTakeSubject() {
        return this.studentsTakeSubjectService.getAllStudentsTakeSubject();
    }

    @GetMapping("/{id}")
    public StudentsTakeSubject getStudentsTakeSubjectById(@PathVariable("id") String studentsTakeSubjectId) {
        return this.studentsTakeSubjectService.getStudentsTakeSubjectById(studentsTakeSubjectId);
    }

    @PostMapping
    public void insert(@RequestBody StudentsTakeSubject studentsTakeSubject) {
        this.studentsTakeSubjectService.insert(studentsTakeSubject);
    }

    @PutMapping
    public ResponseEntity<StudentsTakeSubject> update(@RequestBody StudentsTakeSubject studentsTakeSubject) {
        return new ResponseEntity<>(this.studentsTakeSubjectService.update(studentsTakeSubject), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String studentsTakeSubjectId) {
        this.studentsTakeSubjectService.deleteById(studentsTakeSubjectId);
    }
}