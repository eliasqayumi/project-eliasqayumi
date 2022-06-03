package com.example.meyok.service;

import com.example.meyok.model.Title;

import java.util.List;

public interface TitleService {
    void insert(Title title);
    List<Title> getAllTitle();
    void deleteById(String titleId);
    Title update(Title title);
    Title getTitleById(String titleId);
}
