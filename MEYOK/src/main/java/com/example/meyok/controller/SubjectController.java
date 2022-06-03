package com.example.meyok.controller;

import com.example.meyok.model.Subject;
import com.example.meyok.serviceImpl.SubjectServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("subject")
public class SubjectController {
    private SubjectServiceImpl subjectService;

    public SubjectController(SubjectServiceImpl subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List<Subject> getAllSubject() {
        return this.subjectService.getAllSubjects();
    }

    @GetMapping("/{id}")
    public Subject getSubjectById(@PathVariable("id") String subjectId) {
        return this.subjectService.getSubjectById(subjectId);
    }

    @PostMapping
    public void insert(@RequestBody Subject subject) {
        this.subjectService.insert(subject);
    }

    @PutMapping
    public ResponseEntity<Subject> update(@RequestBody Subject subject) {
        return new ResponseEntity<>(this.subjectService.update(subject), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String subjectId) {
        this.subjectService.deleteById(subjectId);
    }
}