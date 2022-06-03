package com.example.meyok.serviceImpl;

import com.example.meyok.model.District;
import com.example.meyok.repository.DistrictRepository;
import com.example.meyok.service.DistrictService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    private DistrictRepository districtRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @Override
    public void insert(District district) {
        this.districtRepository.save(district);
    }

    @Override
    public List<District> getAllDistrict() {
        return this.districtRepository.findAll().stream().toList();
    }

    @Override
    public void deleteById(String districtId) {
        this.districtRepository.deleteById(districtId);
    }

    @Override
    public District update(District district) {
       return this.districtRepository.save(district);
    }

    @Override
    public District getDistrictById(String districtId) {
        return this.districtRepository.findDistrictById(districtId)
                .orElseThrow(() -> new NotFoundException("District by " + districtId + " id has not found."));
    }

    @Override
    public List<District> getAllDistrictByCityId(String cityId) {
        return this.districtRepository.findAllByCity_Id(cityId);
    }
}
