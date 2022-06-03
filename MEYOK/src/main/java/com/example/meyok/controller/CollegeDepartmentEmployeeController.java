package com.example.meyok.controller;

import com.example.meyok.model.CollegeDepartmentEmployee;
import com.example.meyok.serviceImpl.CollegeDepartmentEmployeeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("college/department/employee")
public class CollegeDepartmentEmployeeController {
    private CollegeDepartmentEmployeeServiceImpl collegeDepartmentEmployeeServiceImpl;

    public CollegeDepartmentEmployeeController(CollegeDepartmentEmployeeServiceImpl collegeDepartmentEmployeeServiceImpl) {
        this.collegeDepartmentEmployeeServiceImpl = collegeDepartmentEmployeeServiceImpl;
    }

    @GetMapping
    public List<CollegeDepartmentEmployee> getAllCollegeDepartmentEmployee() {
        return this.collegeDepartmentEmployeeServiceImpl.getAllCollegeDepartmentEmployeeEmployee();
    }

    @GetMapping("/{id}")
    public CollegeDepartmentEmployee getCollegeDepartmentEmployeeById(@PathVariable("id") String collegeDepartmentEmployeeId) {
        return this.collegeDepartmentEmployeeServiceImpl.getCollegeDepartmentEmployeeId(collegeDepartmentEmployeeId);
    }

    @PostMapping
    public void insert(@RequestBody CollegeDepartmentEmployee collegeDepartmentEmployee) {
        System.out.println(collegeDepartmentEmployee);
        this.collegeDepartmentEmployeeServiceImpl.insert(collegeDepartmentEmployee);
    }

    @PutMapping
    public ResponseEntity<CollegeDepartmentEmployee> update( @RequestBody CollegeDepartmentEmployee collegeDepartmentEmployee) {
        return new ResponseEntity<>(this.collegeDepartmentEmployeeServiceImpl.update(collegeDepartmentEmployee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String collegeDepartmentEmployeeId) {
        this.collegeDepartmentEmployeeServiceImpl.deleteById(collegeDepartmentEmployeeId);
    }
}
