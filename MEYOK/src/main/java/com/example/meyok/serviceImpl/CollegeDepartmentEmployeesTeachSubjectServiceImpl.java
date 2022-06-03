package com.example.meyok.serviceImpl;

import com.example.meyok.model.CollegeDepartmentEmployeesTeachSubject;
import com.example.meyok.model.CollegeDepartmentEmployeesTeachSubjectId;
import com.example.meyok.repository.CollegeDepartmentEmployeesTeachSubjectRepository;
import com.example.meyok.service.CollegeDepartmentEmployeesTeachSubjectService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeDepartmentEmployeesTeachSubjectServiceImpl implements CollegeDepartmentEmployeesTeachSubjectService {
    private CollegeDepartmentEmployeesTeachSubjectRepository collegeDepartmentEmployeesTeachSubjectRepository;

    public CollegeDepartmentEmployeesTeachSubjectServiceImpl(CollegeDepartmentEmployeesTeachSubjectRepository collegeDepartmentEmployeesTeachSubjectRepository) {
        this.collegeDepartmentEmployeesTeachSubjectRepository = collegeDepartmentEmployeesTeachSubjectRepository;
    }

    @Override
    public void insert(CollegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject) {
        this.collegeDepartmentEmployeesTeachSubjectRepository.save(collegeDepartmentEmployeesTeachSubject);
    }

    @Override
    public List<CollegeDepartmentEmployeesTeachSubject> getAllCollegeDepartmentEmployeesTeachSubject() {
        return this.collegeDepartmentEmployeesTeachSubjectRepository.findAll();
    }

    @Override
    public void deleteById(String collegeDepartmentEmployeesTeachSubjectId) {
        this.collegeDepartmentEmployeesTeachSubjectRepository.deleteById(collegeDepartmentEmployeesTeachSubjectId);
    }

    @Override
    public CollegeDepartmentEmployeesTeachSubject update(CollegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject) {
        return this.collegeDepartmentEmployeesTeachSubjectRepository.save(collegeDepartmentEmployeesTeachSubject);
    }

    @Override
    public CollegeDepartmentEmployeesTeachSubject getCollegeDepartmentEmployeesTeachSubjectById(String collegeDepartmentEmployeesTeachSubjectId) {
        return this.collegeDepartmentEmployeesTeachSubjectRepository.findCollegeDepartmentEmployeesTeachSubjectById(collegeDepartmentEmployeesTeachSubjectId)
                .orElseThrow(() -> new NotFoundException("College department employees teach subject by "
                        + collegeDepartmentEmployeesTeachSubjectId + " id not found."));
    }
}
