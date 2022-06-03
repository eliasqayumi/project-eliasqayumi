package com.example.meyok.serviceImpl;

import com.example.meyok.model.Department;
import com.example.meyok.repository.DepartmentRepository;
import com.example.meyok.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void insert(Department department) {
        this.departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteById(String departmentId) {
        this.departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department update(Department department) {
       return this.departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(String departmentId) {
        return this.departmentRepository.findDepartmentById(departmentId).orElseThrow();
    }
}
