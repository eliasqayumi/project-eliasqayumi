package com.example.meyok.serviceImpl;

import com.example.meyok.model.Student;
import com.example.meyok.repository.StudentRepository;
import com.example.meyok.service.StudentService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void insert(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public void deleteById(String studentId) {
        this.studentRepository.deleteById(studentId);
    }

    @Override
    public Student update( Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public Student getStudentById(String studentId) {
        return this.studentRepository.findStudentById(studentId)
                .orElseThrow(() -> new NotFoundException("Student by " + studentId + " id has not found"));
    }
}
