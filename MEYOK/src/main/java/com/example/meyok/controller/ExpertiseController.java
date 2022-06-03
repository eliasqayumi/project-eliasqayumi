package com.example.meyok.controller;

import com.example.meyok.model.Expertise;
import com.example.meyok.serviceImpl.ExpertiseServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("expertise")
public class ExpertiseController {
    private ExpertiseServiceImpl expertiseService;

    public ExpertiseController(ExpertiseServiceImpl expertiseService) {
        this.expertiseService = expertiseService;
    }

    @GetMapping
    public List<Expertise> getAllExpertise() {
        return this.expertiseService.getAllExpertises();
    }

    @GetMapping("/{id}")
    public Expertise getExpertiseById(@PathVariable("id") String expertiseId) {
        return this.expertiseService.getExpertiseById(expertiseId);
    }

    @PostMapping
    public void insert(@RequestBody Expertise expertise) {
        this.expertiseService.insert(expertise);
    }

    @PutMapping
    public ResponseEntity<Expertise> update(@RequestBody Expertise expertise) {
        return new ResponseEntity<>(this.expertiseService.update( expertise), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String expertiseId) {
        this.expertiseService.deleteById(expertiseId);
    }
}