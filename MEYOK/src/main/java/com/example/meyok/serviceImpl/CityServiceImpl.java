package com.example.meyok.serviceImpl;

import com.example.meyok.model.City;
import com.example.meyok.repository.CityRepository;
import com.example.meyok.service.CityService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    private CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public void insert(City city) {
        cityRepository.save(city);
    }

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public void deleteById(String cityId) {
        cityRepository.deleteById(cityId);
    }

    @Override
    public City update( City city) {
        return cityRepository.save(city);
    }

    @Override
    public City getCityById(String cityId) {
        return cityRepository.findCityById(cityId).orElseThrow();
    }
}
