package com.example.meyok.serviceImpl;

import com.example.meyok.model.Expertise;
import com.example.meyok.repository.ExpertiseRepository;
import com.example.meyok.service.ExpertiseService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpertiseServiceImpl implements ExpertiseService {
    private ExpertiseRepository expertiseRepository;

    public ExpertiseServiceImpl(ExpertiseRepository expertiseRepository) {
        this.expertiseRepository = expertiseRepository;
    }

    @Override
    public void insert(Expertise expertise) {
        this.expertiseRepository.save(expertise);
    }

    @Override
    public List<Expertise> getAllExpertises() {
        return this.expertiseRepository.findAll();
    }

    @Override
    public void deleteById(String expertiseId) {
        this.expertiseRepository.deleteById(expertiseId);
    }

    @Override
    public Expertise update(Expertise expertise) {
      return this.expertiseRepository.save(expertise);
    }

    @Override
    public Expertise getExpertiseById(String expertiseId) {
        return this.expertiseRepository.findExpertiseById(expertiseId)
                .orElseThrow(()-> new NotFoundException("Expertise by "+expertiseId+" id has not found."));
    }
}
