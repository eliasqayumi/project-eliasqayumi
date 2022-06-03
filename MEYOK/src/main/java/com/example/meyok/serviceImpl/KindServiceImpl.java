package com.example.meyok.serviceImpl;

import com.example.meyok.model.Kind;
import com.example.meyok.repository.KindRepository;
import com.example.meyok.service.KindService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KindServiceImpl implements KindService {
    private KindRepository kindRepository;

    public KindServiceImpl(KindRepository kindRepository) {
        this.kindRepository = kindRepository;
    }

    @Override
    public void insert(Kind kind) {
        this.kindRepository.save(kind);
    }

    @Override
    public List<Kind> getAllKind() {
        return this.kindRepository.findAll();
    }

    @Override
    public void deleteById(String kindId) {
        this.kindRepository.deleteById(kindId);
    }

    @Override
    public Kind update( Kind kind) {
      return this.kindRepository.save(kind);
    }

    @Override
    public Kind getKindById(String kindId) {
        return this.kindRepository.findKindById(kindId).orElseThrow(()->new NotFoundException("Kind by "+kindId+" id has not found."));
    }
}
