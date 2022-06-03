package com.example.meyok.serviceImpl;

import com.example.meyok.model.CollegeDepartmentSubject;
import com.example.meyok.repository.CollegeDepartmentSubjectRepository;
import com.example.meyok.service.CollegeDepartmentSubjectService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeDepartmentSubjectServiceImpl implements CollegeDepartmentSubjectService {
    private CollegeDepartmentSubjectRepository collegeDepartmentSubjectRepository;

    public CollegeDepartmentSubjectServiceImpl(CollegeDepartmentSubjectRepository collegeDepartmentSubjectRepository) {
        this.collegeDepartmentSubjectRepository = collegeDepartmentSubjectRepository;
    }

    @Override
    public void insert(CollegeDepartmentSubject collegeDepartmentSubject) {
        this.collegeDepartmentSubjectRepository.save(collegeDepartmentSubject);
    }

    @Override
    public List<CollegeDepartmentSubject> getAllCollegeDepartmentSubject() {
        return this.collegeDepartmentSubjectRepository.findAll();
    }

    @Override
    public void deleteById(String collegeDepartmentSubjectId) {
        this.collegeDepartmentSubjectRepository.deleteById(collegeDepartmentSubjectId);
    }

    @Override
    public CollegeDepartmentSubject update( CollegeDepartmentSubject collegeDepartmentSubject) {
        return this.collegeDepartmentSubjectRepository.save(collegeDepartmentSubject);
    }

    @Override
    public CollegeDepartmentSubject getCollegeDepartmentSubjectById(String collegeDepartmentSubjectId) {
        return this.collegeDepartmentSubjectRepository.findCollegeDepartmentSubjectById(collegeDepartmentSubjectId)
                .orElseThrow(() -> new NotFoundException("College department subject by " + collegeDepartmentSubjectId + " id not found"));
    }
}
