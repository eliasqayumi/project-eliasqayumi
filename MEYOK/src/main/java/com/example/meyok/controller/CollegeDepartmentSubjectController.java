package com.example.meyok.controller;

import com.example.meyok.model.CollegeDepartmentSubject;
import com.example.meyok.serviceImpl.CollegeDepartmentSubjectServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("college/department/subject")
public class CollegeDepartmentSubjectController {
    private CollegeDepartmentSubjectServiceImpl collegeDepartmentSubjectService;

    public CollegeDepartmentSubjectController(CollegeDepartmentSubjectServiceImpl collegeDepartmentSubjectService) {
        this.collegeDepartmentSubjectService = collegeDepartmentSubjectService;
    }

    @GetMapping
    public List<CollegeDepartmentSubject> getAllCollegeDepartmentSubject() {
        return this.collegeDepartmentSubjectService.getAllCollegeDepartmentSubject();
    }

    @GetMapping("/{id}")
    public CollegeDepartmentSubject getCollegeDepartmentSubjectById(@PathVariable("id") String collegeDepartmentSubjectId) {
        return this.collegeDepartmentSubjectService.getCollegeDepartmentSubjectById(collegeDepartmentSubjectId);
    }

    @PostMapping
    public void insert(@RequestBody CollegeDepartmentSubject collegeDepartmentSubject) {
        this.collegeDepartmentSubjectService.insert(collegeDepartmentSubject);
    }

    @PutMapping
    public ResponseEntity<CollegeDepartmentSubject> update(@RequestBody CollegeDepartmentSubject collegeDepartmentSubject) {
        return new ResponseEntity<>(this.collegeDepartmentSubjectService.update(collegeDepartmentSubject), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String collegeDepartmentSubjectId) {
        this.collegeDepartmentSubjectService.deleteById(collegeDepartmentSubjectId);
    }
}
