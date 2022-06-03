package com.example.meyok.repository;

import com.example.meyok.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City,String> {
    Optional<City> findCityById(String cityId);
    Optional<City> getCityByCityName(String cityName);
}
