package com.example.meyok.service;

import com.example.meyok.model.Employee;

import java.util.List;

public interface EmployeeService {
    void insert(Employee employee);
    List<Employee> getAllEmployee();
    void deleteById(String employeeId);
    Employee update(Employee employee);
    Employee getEmployeeById(String employeeId);
}
