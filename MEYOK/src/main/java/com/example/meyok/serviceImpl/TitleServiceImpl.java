package com.example.meyok.serviceImpl;

import com.example.meyok.model.Title;
import com.example.meyok.repository.TitleRepository;
import com.example.meyok.service.TitleService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TitleServiceImpl implements TitleService {
    private TitleRepository titleRepository;

    public TitleServiceImpl(TitleRepository titleRepository) {
        this.titleRepository = titleRepository;
    }

    @Override
    public void insert(Title title) {
        this.titleRepository.save(title);
    }

    @Override
    public List<Title> getAllTitle() {
        return this.titleRepository.findAll();
    }

    @Override
    public void deleteById(String titleId) {
        this.titleRepository.deleteById(titleId);
    }

    @Override
    public Title update(Title title) {
       return this.titleRepository.save(title);
    }

    @Override
    public Title getTitleById(String titleId) {
        return this.titleRepository.findTitleById(titleId)
                .orElseThrow(()->new NotFoundException("Title by "+titleId+" id has not found."));
    }
}
