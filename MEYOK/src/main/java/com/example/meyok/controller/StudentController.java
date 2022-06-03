package com.example.meyok.controller;

import com.example.meyok.model.Student;
import com.example.meyok.serviceImpl.StudentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    private StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return this.studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") String studentId) {
        return this.studentService.getStudentById(studentId);
    }

    @PostMapping
    public void insert(@RequestBody Student student) {
        this.studentService.insert(student);
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody Student student) {
        return new ResponseEntity<>(this.studentService.update( student), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String studentId) {
        this.studentService.deleteById(studentId);
    }
}