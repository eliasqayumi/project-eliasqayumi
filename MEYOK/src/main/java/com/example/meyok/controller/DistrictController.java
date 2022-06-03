package com.example.meyok.controller;

import com.example.meyok.model.City;
import com.example.meyok.model.District;
import com.example.meyok.serviceImpl.CityServiceImpl;
import com.example.meyok.serviceImpl.DistrictServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("district")
public class DistrictController {
    private DistrictServiceImpl districtService;

    public DistrictController(DistrictServiceImpl districtService) {
        this.districtService = districtService;
    }

    @GetMapping
    public List<District> getAllDistrict() {
        return this.districtService.getAllDistrict();
    }


    @GetMapping("/{id}")
    public List<District> getDistrictById(@PathVariable("id") String districtId) {
        return this.districtService.getAllDistrictByCityId(districtId);
    }
    @PostMapping
    public void insert(@RequestBody District district) {
        System.out.println("My new data"+district);
        this.districtService.insert(district);
    }

    @PutMapping
    public ResponseEntity<District> update(@RequestBody District district) {
        return new ResponseEntity<>(this.districtService.update(district), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String districtId) {
        this.districtService.deleteById(districtId);
    }
}
