package com.example.meyok.serviceImpl;

import com.example.meyok.model.CollegeDepartment;
import com.example.meyok.repository.CollegeDepartmentRepository;
import com.example.meyok.service.CollegeDepartmentService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeDepartmentServiceImpl implements CollegeDepartmentService {
    private CollegeDepartmentRepository collegeDepartmentRepository;

    public CollegeDepartmentServiceImpl(CollegeDepartmentRepository collegeDepartmentRepository) {
        this.collegeDepartmentRepository = collegeDepartmentRepository;
    }

    @Override
    public void insert(CollegeDepartment collegeDepartment) {
        this.collegeDepartmentRepository.save(collegeDepartment);
    }

    @Override
    public List<CollegeDepartment> getAllCollegeDepartment() {
        return this.collegeDepartmentRepository.findAll();
    }

    @Override
    public void deleteById(String collegeDepartmentId) {
        this.collegeDepartmentRepository.deleteById(collegeDepartmentId);
    }

    @Override
    public CollegeDepartment update(CollegeDepartment collegeDepartment) {
        return this.collegeDepartmentRepository.save(collegeDepartment);
    }

    @Override
    public CollegeDepartment getCollegeDepartmentById(String collegeDepartmentId) {
        return this.collegeDepartmentRepository.findCollegeDepartmentById(collegeDepartmentId)
                .orElseThrow(() -> new NotFoundException("College department by " + collegeDepartmentId + " id not found"));
    }
}
