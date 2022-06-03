package com.example.meyok.controller;

import com.example.meyok.model.Department;
import com.example.meyok.serviceImpl.DepartmentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("department")
public class DepartmentController {
    private DepartmentServiceImpl departmentService;

    public DepartmentController(DepartmentServiceImpl departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> getAllDepartment() {
        return this.departmentService.getAllDepartment();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") String departmentId) {
        return this.departmentService.getDepartmentById(departmentId);
    }

    @PostMapping
    public void insert(@RequestBody Department department) {
        this.departmentService.insert(department);
    }

    @PutMapping
    public ResponseEntity<Department> update( @RequestBody Department department) {
       return new ResponseEntity<Department>( this.departmentService.update(department), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String departmentId) {
        this.departmentService.deleteById(departmentId);
    }
}
