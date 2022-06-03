package com.example.meyok.serviceImpl;

import com.example.meyok.model.Term;
import com.example.meyok.repository.TermRepository;
import com.example.meyok.service.TermService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TermServiceImpl implements TermService {
    private TermRepository termRepository;

    public TermServiceImpl(TermRepository termRepository) {
        this.termRepository = termRepository;
    }

    @Override
    public void insert(Term term) {
        this.termRepository.save(term);
    }

    @Override
    public List<Term> getAllTerm() {
        return this.termRepository.findAll();
    }

    @Override
    public void deleteById(String termId) {
        this.termRepository.deleteById(termId);
    }

    @Override
    public Term update(Term term) {
        return  this.termRepository.save(term);
    }

    @Override
    public Term getTermById(String termId) {
        return this.termRepository.findTermById(termId)
                .orElseThrow(()->new NotFoundException("Term by "+termId+" id has not found"));
    }
}
