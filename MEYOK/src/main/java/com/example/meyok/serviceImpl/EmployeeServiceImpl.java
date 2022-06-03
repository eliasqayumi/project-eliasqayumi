package com.example.meyok.serviceImpl;

import com.example.meyok.model.Employee;
import com.example.meyok.repository.EmployeeRepository;
import com.example.meyok.service.EmployeeService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void insert(Employee employee) {
    employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return this.employeeRepository.findAll();
    }

    @Override
    public void deleteById(String employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public Employee update(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(String employeeId) {
        return this.employeeRepository.findEmployeeById(employeeId)
                .orElseThrow(()->new NotFoundException("Employee by "+employeeId+" id has not found."));
    }
}
