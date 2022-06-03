package com.example.meyok.controller;

import com.example.meyok.model.Kind;
import com.example.meyok.serviceImpl.KindServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("kind")
public class KindController {
    private KindServiceImpl kindService;

    public KindController(KindServiceImpl KindService) {
        this.kindService = KindService;
    }

    @GetMapping
    public List<Kind> getAllKind() {
        return this.kindService.getAllKind();
    }

    @GetMapping("/{id}")
    public Kind getKindById(@PathVariable("id") String kindId) {
        return this.kindService.getKindById(kindId);
    }

    @PostMapping
    public void insert(@RequestBody Kind kind) {
        this.kindService.insert(kind);
    }

    @PutMapping
    public ResponseEntity<Kind> update(@RequestBody Kind kind) {
        return new ResponseEntity<>(this.kindService.update(kind), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String kindId) {
        this.kindService.deleteById(kindId);
    }
}