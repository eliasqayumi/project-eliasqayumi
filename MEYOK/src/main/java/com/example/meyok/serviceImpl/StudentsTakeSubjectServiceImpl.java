package com.example.meyok.serviceImpl;

import com.example.meyok.model.StudentsTakeSubject;
import com.example.meyok.repository.StudentTakeSubjectRepository;
import com.example.meyok.service.StudentsTakeSubjectService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsTakeSubjectServiceImpl implements StudentsTakeSubjectService {
    private StudentTakeSubjectRepository studentTakeSubjectRepository;

    public StudentsTakeSubjectServiceImpl(StudentTakeSubjectRepository studentTakeSubjectRepository) {
        this.studentTakeSubjectRepository = studentTakeSubjectRepository;
    }

    @Override
    public void insert(StudentsTakeSubject studentsTakeSubject) {
        this.studentTakeSubjectRepository.save(studentsTakeSubject);
    }

    @Override
    public List<com.example.meyok.model.StudentsTakeSubject> getAllStudentsTakeSubject() {
        return this.studentTakeSubjectRepository.findAll();
    }

    @Override
    public void deleteById(String studentsTakeSubjectId) {
        this.studentTakeSubjectRepository.deleteById(studentsTakeSubjectId);
    }

    @Override
    public StudentsTakeSubject update( StudentsTakeSubject studentsTakeSubject) {
        return this.studentTakeSubjectRepository.save(studentsTakeSubject);
    }

    @Override
    public com.example.meyok.model.StudentsTakeSubject getStudentsTakeSubjectById(String studentsTakeSubjectId) {
        return this.studentTakeSubjectRepository
                .findStudentsTakeSubjectById(studentsTakeSubjectId)
                .orElseThrow(() -> new NotFoundException("Student take subject by " + studentsTakeSubjectId + " id has not found"));
    }
}
