package com.example.meyok.controller;

import com.example.meyok.model.CollegeEmployee;
import com.example.meyok.serviceImpl.CollegeEmployeeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("college/employee")
public class CollegeEmployeeController {
    private CollegeEmployeeServiceImpl collegeEmployeeService;

    public CollegeEmployeeController(CollegeEmployeeServiceImpl collegeEmployeeService) {
        this.collegeEmployeeService = collegeEmployeeService;
    }

    @GetMapping
    public List<CollegeEmployee> getAllCollegeEmployee() {
        return this.collegeEmployeeService.getAllCollegeEmployee();
    }

    @GetMapping("/{id}")
    public CollegeEmployee getCollegeEmployeeById(@PathVariable("id") String collegeEmployeeId) {
        return this.collegeEmployeeService.getCollegeEmployeeById(collegeEmployeeId);
    }

    @PostMapping
    public void insert(@RequestBody CollegeEmployee collegeEmployee) {
        this.collegeEmployeeService.insert(collegeEmployee);
    }

    @PutMapping
    public ResponseEntity<CollegeEmployee> update(@RequestBody CollegeEmployee collegeEmployee) {
        return new ResponseEntity<>(this.collegeEmployeeService.update(collegeEmployee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String collegeEmployeeId) {
        this.collegeEmployeeService.deleteById(collegeEmployeeId);
    }
}
