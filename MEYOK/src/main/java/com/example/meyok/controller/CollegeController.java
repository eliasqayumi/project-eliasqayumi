package com.example.meyok.controller;

import com.example.meyok.model.College;
import com.example.meyok.serviceImpl.CollegeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("college")
public class CollegeController {
    private CollegeServiceImpl collegeServiceImpl;

    public CollegeController(CollegeServiceImpl collegeServiceImpl) {
        this.collegeServiceImpl=collegeServiceImpl;
    }

    @GetMapping
    public List<College> getAllCities() {
        return this.collegeServiceImpl.getAllColleges();
    }

    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable("id") String collegeId) {
        return this.collegeServiceImpl.getCollegeById(collegeId);
    }

    @PostMapping
    public void insert(@RequestBody College college) {
        this.collegeServiceImpl.insert(college);
    }

    @PutMapping
    public ResponseEntity<College> update( @RequestBody College college) {
        return new ResponseEntity<>(this.collegeServiceImpl.update(college), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String collegeId) {
        collegeServiceImpl.deleteById(collegeId);
    }


}
