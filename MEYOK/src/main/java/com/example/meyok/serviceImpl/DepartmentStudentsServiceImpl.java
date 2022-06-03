package com.example.meyok.serviceImpl;

import com.example.meyok.model.Department;
import com.example.meyok.model.DepartmentStudents;
import com.example.meyok.repository.DepartmentStudentsRepository;
import com.example.meyok.service.DepartmentStudentsService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentStudentsServiceImpl implements DepartmentStudentsService {
    private DepartmentStudentsRepository departmentStudentsRepository;

    public DepartmentStudentsServiceImpl(DepartmentStudentsRepository departmentStudentsRepository) {
        this.departmentStudentsRepository = departmentStudentsRepository;
    }

    @Override
    public void insert(DepartmentStudents departmentStudents) {
        this.departmentStudentsRepository.save(departmentStudents);
    }

    @Override
    public List<DepartmentStudents> getAllDepartmentStudents() {
        return this.departmentStudentsRepository.findAll();
    }

    @Override
    public void deleteById(String departmentStudentsId) {
        this.departmentStudentsRepository.deleteById(departmentStudentsId);
    }

    @Override
    public DepartmentStudents update(DepartmentStudents departmentStudents) {
        return this.departmentStudentsRepository.save(departmentStudents);
    }

    @Override
    public DepartmentStudents getDepartmentStudentsById(String departmentStudentsId) {
        return this.departmentStudentsRepository
                .findDepartmentStudentsById(departmentStudentsId)
                .orElseThrow(() -> new NotFoundException("Department students by " + departmentStudentsId + " id has not found"));
    }
}
