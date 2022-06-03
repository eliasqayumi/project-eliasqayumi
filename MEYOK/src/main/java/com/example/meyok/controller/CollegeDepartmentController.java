package com.example.meyok.controller;

import com.example.meyok.model.CollegeDepartment;
import com.example.meyok.serviceImpl.CollegeDepartmentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("college/department")
public class CollegeDepartmentController {
    private CollegeDepartmentServiceImpl collegeDepartmentService;

    public CollegeDepartmentController(CollegeDepartmentServiceImpl collegeDepartmentService) {
        this.collegeDepartmentService = collegeDepartmentService;
    }

    @GetMapping
    public List<CollegeDepartment> getAllCollegeDepartment() {
        return this.collegeDepartmentService.getAllCollegeDepartment();
    }

    @GetMapping("/{id}")
    public CollegeDepartment getCollegeDepartmentById(@PathVariable("id") String collegeDepartmentId) {
        return this.collegeDepartmentService.getCollegeDepartmentById(collegeDepartmentId);
    }

    @PostMapping
    public void insert(@RequestBody CollegeDepartment collegeDepartment) {
        this.collegeDepartmentService.insert(collegeDepartment);
    }

    @PutMapping
    public ResponseEntity<CollegeDepartment> update(@RequestBody CollegeDepartment collegeDepartment) {
        return new ResponseEntity<>(this.collegeDepartmentService.update(collegeDepartment), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String collegeDepartmentId) {
        this.collegeDepartmentService.deleteById(collegeDepartmentId);
    }
}
