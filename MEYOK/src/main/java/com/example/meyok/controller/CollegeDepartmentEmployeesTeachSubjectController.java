package com.example.meyok.controller;

import com.example.meyok.model.CollegeDepartmentEmployeesTeachSubject;
import com.example.meyok.serviceImpl.CollegeDepartmentEmployeesTeachSubjectServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("college/department/employees/teach/subject")
public class CollegeDepartmentEmployeesTeachSubjectController {
    private CollegeDepartmentEmployeesTeachSubjectServiceImpl collegeDepartmentEmployeesTeachSubjectService;

    public CollegeDepartmentEmployeesTeachSubjectController(CollegeDepartmentEmployeesTeachSubjectServiceImpl collegeDepartmentEmployeesTeachSubjectService) {
        this.collegeDepartmentEmployeesTeachSubjectService = collegeDepartmentEmployeesTeachSubjectService;
    }

    @GetMapping
    public List<CollegeDepartmentEmployeesTeachSubject> getAllCollegeDepartmentEmployeesTeachSubject() {
        return this.collegeDepartmentEmployeesTeachSubjectService.getAllCollegeDepartmentEmployeesTeachSubject();
    }

    @GetMapping("/{id}")
    public CollegeDepartmentEmployeesTeachSubject getCollegeDepartmentEmployeesTeachSubjectById(@PathVariable("id") String collegeDepartmentEmployeesTeachSubjectId) {
        return this.collegeDepartmentEmployeesTeachSubjectService.getCollegeDepartmentEmployeesTeachSubjectById(collegeDepartmentEmployeesTeachSubjectId);
    }

    @PostMapping
    public void insert(@RequestBody CollegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject) {
        this.collegeDepartmentEmployeesTeachSubjectService.insert(collegeDepartmentEmployeesTeachSubject);
    }

    @PutMapping
    public ResponseEntity<CollegeDepartmentEmployeesTeachSubject> update(@RequestBody CollegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject) {
        return new ResponseEntity<>( this.collegeDepartmentEmployeesTeachSubjectService.update(collegeDepartmentEmployeesTeachSubject), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String collegeDepartmentEmployeesTeachSubjectId) {
        this.collegeDepartmentEmployeesTeachSubjectService.deleteById(collegeDepartmentEmployeesTeachSubjectId);
    }
}
