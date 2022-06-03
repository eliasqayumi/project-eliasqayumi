package com.example.meyok.service;

import com.example.meyok.model.Task;

import java.util.List;

public interface TaskService {
    void insert(Task task);
    List<Task> getAllTask();
    void deleteById(String taskId);
    Task update(Task task);
    Task getTaskById(String taskId);
}
