package com.example.meyok.serviceImpl;

import com.example.meyok.model.CollegeEmployee;
import com.example.meyok.repository.CollegeEmployeeRepository;
import com.example.meyok.service.CollegeEmployeeService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeEmployeeServiceImpl implements CollegeEmployeeService {
    private CollegeEmployeeRepository collegeEmployeeRepository;

    public CollegeEmployeeServiceImpl(CollegeEmployeeRepository collegeEmployeeRepository) {
        this.collegeEmployeeRepository = collegeEmployeeRepository;
    }

    @Override
    public void insert(CollegeEmployee collegeEmployee) {
        this.collegeEmployeeRepository.save(collegeEmployee);
    }

    @Override
    public List<CollegeEmployee> getAllCollegeEmployee() {
        return this.collegeEmployeeRepository.findAll();
    }

    @Override
    public void deleteById(String collegeEmployeeId) {
        this.collegeEmployeeRepository.deleteById(collegeEmployeeId);
    }

    @Override
    public CollegeEmployee update(CollegeEmployee collegeEmployee) {
        return this.collegeEmployeeRepository.save(collegeEmployee);
    }

    @Override
    public CollegeEmployee getCollegeEmployeeById(String collegeEmployeeId) {
        return this.collegeEmployeeRepository.findCollegeEmployeeById(collegeEmployeeId)
                .orElseThrow(() -> new NotFoundException("College employee by" + collegeEmployeeId + " id has not found"));
    }
}
