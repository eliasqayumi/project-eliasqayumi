package com.example.meyok.controller;

import com.example.meyok.model.DepartmentStudents;
import com.example.meyok.serviceImpl.DepartmentStudentsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("department/students")
public class DepartmentStudentsController {
    private DepartmentStudentsServiceImpl departmentStudentsService;

    public DepartmentStudentsController(DepartmentStudentsServiceImpl departmentStudentsService) {
        this.departmentStudentsService = departmentStudentsService;
    }

    @GetMapping
    public List<DepartmentStudents> getAllDepartmentStudents() {
        return this.departmentStudentsService.getAllDepartmentStudents();
    }

    @GetMapping("/{id}")
    public DepartmentStudents getDepartmentStudentsById(@PathVariable("id") String departmentStudentsId) {
        return this.departmentStudentsService.getDepartmentStudentsById(departmentStudentsId);
    }

    @PostMapping
    public void insert(@RequestBody DepartmentStudents departmentStudents) {
        this.departmentStudentsService.insert(departmentStudents);
    }

    @PutMapping
    public ResponseEntity<DepartmentStudents> update( @RequestBody DepartmentStudents departmentStudents) {
       return new ResponseEntity<>( this.departmentStudentsService.update(departmentStudents), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String departmentStudentsId) {
        this.departmentStudentsService.deleteById(departmentStudentsId);
    }
}
