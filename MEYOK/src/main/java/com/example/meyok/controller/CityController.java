package com.example.meyok.controller;

import com.example.meyok.model.City;
import com.example.meyok.serviceImpl.CityServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("city")
public class CityController {
    private CityServiceImpl cityServiceImpl;

    public CityController(CityServiceImpl cityServiceImpl) {
        this.cityServiceImpl = cityServiceImpl;
    }

    @GetMapping
    public List<City> getAllCities() {
        return this.cityServiceImpl.getAllCities();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable("id") String cityId) {
        return this.cityServiceImpl.getCityById(cityId);
    }

    @PostMapping
    public void insert(@RequestBody City city) {
        this.cityServiceImpl.insert(city);
    }

    @PutMapping
    public ResponseEntity<City> update(@RequestBody City city) {
        City updateCity = this.cityServiceImpl.update(city);
        return new ResponseEntity<>(updateCity, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String cityId) {
        cityServiceImpl.deleteById(cityId);
    }


}
