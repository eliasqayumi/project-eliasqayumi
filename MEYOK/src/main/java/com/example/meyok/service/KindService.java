package com.example.meyok.service;

import com.example.meyok.model.Kind;

import java.util.List;

public interface KindService {
    void insert(Kind kind);
    List<Kind> getAllKind();
    void deleteById(String kindId);
    Kind update(Kind kind);
    Kind getKindById(String kindId);
}
