package com.example.meyok.controller;

import com.example.meyok.model.Employee;
import com.example.meyok.serviceImpl.EmployeeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployee() {
        return this.employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") String employeeId) {
        return this.employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public void insert(@RequestBody Employee employee) {
        this.employeeService.insert(employee);
    }

    @PutMapping
    public ResponseEntity<Employee> update(@RequestBody Employee employee) {
        return new ResponseEntity<>(this.employeeService.update(employee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String employeeId) {
        this.employeeService.deleteById(employeeId);
    }
}
