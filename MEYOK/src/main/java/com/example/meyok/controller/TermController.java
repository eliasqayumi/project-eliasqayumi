package com.example.meyok.controller;

import com.example.meyok.model.Term;
import com.example.meyok.serviceImpl.TermServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("term")
public class TermController {
    private TermServiceImpl termService;

    public TermController(TermServiceImpl termService) {
        this.termService = termService;
    }

    @GetMapping
    public List<Term> getAllTerm() {
        return this.termService.getAllTerm();
    }

    @GetMapping("/{id}")
    public Term getTermById(@PathVariable("id") String termId) {
        return this.termService.getTermById(termId);
    }

    @PostMapping
    public void insert(@RequestBody Term term) {
        this.termService.insert(term);
    }

    @PutMapping
    public ResponseEntity<Term> update(@RequestBody Term term) {
        return new ResponseEntity<Term>(this.termService.update(term),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String termId) {
        this.termService.deleteById(termId);
    }
}
