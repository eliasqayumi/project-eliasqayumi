package com.example.meyok.serviceImpl;

import com.example.meyok.model.Subject;
import com.example.meyok.repository.SubjectRepository;
import com.example.meyok.service.SubjectService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    private SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public void insert(Subject subject) {
        this.subjectRepository.save(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return this.subjectRepository.findAll();
    }

    @Override
    public void deleteById(String subjectId) {
        this.subjectRepository.deleteById(subjectId);
    }

    @Override
    public Subject update( Subject subject) {
        return this.subjectRepository.save(subject);
    }

    @Override
    public Subject getSubjectById(String subjectId) {
        return this.subjectRepository.findSubjectById(subjectId)
                .orElseThrow(() -> new NotFoundException("Subject by " + subjectId + " id has not found."));
    }
}
