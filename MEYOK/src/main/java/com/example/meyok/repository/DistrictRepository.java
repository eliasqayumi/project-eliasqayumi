package com.example.meyok.repository;

import com.example.meyok.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DistrictRepository extends JpaRepository<District,String> {
    Optional<District> findDistrictById(String districtId);
    List<District> findAllByCity_Id(String cityId);
}
