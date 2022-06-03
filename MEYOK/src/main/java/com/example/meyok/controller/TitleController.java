package com.example.meyok.controller;

import com.example.meyok.model.Title;
import com.example.meyok.serviceImpl.TitleServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("title")
public class TitleController {
    private TitleServiceImpl titleService;

    public TitleController(TitleServiceImpl titleService) {
        this.titleService = titleService;
    }

    @GetMapping
    public List<Title> getAllTitle() {
        return this.titleService.getAllTitle();
    }

    @GetMapping("/{id}")
    public Title getTitleById(@PathVariable("id") String titleId) {
        return this.titleService.getTitleById(titleId);
    }

    @PostMapping
    public void insert(@RequestBody Title title) {
        this.titleService.insert(title);
    }

    @PutMapping
    public ResponseEntity<Title> update(@RequestBody Title title) {
        return new ResponseEntity<Title>(this.titleService.update(title), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String titleId) {
        this.titleService.deleteById(titleId);
    }
}