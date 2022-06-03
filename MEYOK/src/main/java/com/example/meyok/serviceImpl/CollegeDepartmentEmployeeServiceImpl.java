package com.example.meyok.serviceImpl;

import com.example.meyok.model.CollegeDepartmentEmployee;
import com.example.meyok.repository.CollegeDepartmentEmployeeRepository;
import com.example.meyok.service.CollegeDepartmentEmployeeService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeDepartmentEmployeeServiceImpl implements CollegeDepartmentEmployeeService {
    private CollegeDepartmentEmployeeRepository collegeDepartmentEmployeeRepository;

    public CollegeDepartmentEmployeeServiceImpl(CollegeDepartmentEmployeeRepository collegeDepartmentEmployeeRepository) {
        this.collegeDepartmentEmployeeRepository = collegeDepartmentEmployeeRepository;
    }

    @Override
    public void insert(CollegeDepartmentEmployee collegeDepartmentEmployee) {
        this.collegeDepartmentEmployeeRepository.save(collegeDepartmentEmployee);
    }

    @Override
    public List<CollegeDepartmentEmployee> getAllCollegeDepartmentEmployeeEmployee() {
        return this.collegeDepartmentEmployeeRepository.findAll();
    }

    @Override
    public void deleteById(String collegeDepartmentEmployeeId) {
        this.collegeDepartmentEmployeeRepository.deleteById(collegeDepartmentEmployeeId);
    }

    @Override
    public CollegeDepartmentEmployee update(CollegeDepartmentEmployee collegeDepartmentEmployee) {
        return this.collegeDepartmentEmployeeRepository.save(collegeDepartmentEmployee);
    }

    @Override
    public CollegeDepartmentEmployee getCollegeDepartmentEmployeeId(String collegeDepartmentEmployeeId) {
        return this.collegeDepartmentEmployeeRepository.findCollegeDepartmentEmployeeById(collegeDepartmentEmployeeId)
                .orElseThrow(() -> new NotFoundException("College department employee by " + collegeDepartmentEmployeeId + " id has not found."));
    }
}
