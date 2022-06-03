package com.example.meyok.service;

import com.example.meyok.model.Term;

import java.util.List;

public interface TermService {
    void insert(Term term);
    List<Term> getAllTerm();
    void deleteById(String termId);
    Term update(Term term);
    Term getTermById(String termId);
}
