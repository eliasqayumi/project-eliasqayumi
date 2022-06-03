package com.example.meyok.service;

import com.example.meyok.model.District;

import java.util.List;

public interface DistrictService {
    void insert(District district);
    List<District> getAllDistrict();
    List<District> getAllDistrictByCityId(String cityId);
    void deleteById(String districtId);
    District update(District district);
    District getDistrictById(String districtId);
}
