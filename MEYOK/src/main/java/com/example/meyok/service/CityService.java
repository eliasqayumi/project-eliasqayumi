package com.example.meyok.service;

import com.example.meyok.model.City;

import java.util.List;

public interface CityService {
    void insert(City city);
    List<City> getAllCities();
    void deleteById(String cityId);
    City update(City city);
    City getCityById(String cityId);
}
