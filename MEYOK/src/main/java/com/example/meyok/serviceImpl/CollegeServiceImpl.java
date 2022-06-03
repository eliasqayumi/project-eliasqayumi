package com.example.meyok.serviceImpl;

import com.example.meyok.model.College;
import com.example.meyok.repository.CollegeRepository;
import com.example.meyok.service.CollegeService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollegeServiceImpl implements CollegeService {
    private CollegeRepository collegeRepository;

    public CollegeServiceImpl(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    @Override
    public void insert(College college) {
        this.collegeRepository.save(college);
    }

    @Override
    public List<College> getAllColleges() {
        return this.collegeRepository.findAll();
    }

    @Override
    public void deleteById(String collegeId) {
        this.collegeRepository.deleteById(collegeId);
    }

    @Override
    public College update(College college) {
      return this.collegeRepository.save(college);
    }

    @Override
    public College getCollegeById(String collegeId) {
        return this.collegeRepository.findCollegeById(collegeId)
                .orElseThrow(() -> new NotFoundException("College by " + collegeId + " id has not found"));
    }
}
