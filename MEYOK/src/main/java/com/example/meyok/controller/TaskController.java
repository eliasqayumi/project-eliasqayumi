package com.example.meyok.controller;

import com.example.meyok.model.Task;
import com.example.meyok.serviceImpl.TaskServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("task")
public class TaskController {
    private TaskServiceImpl taskService;

    public TaskController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTask() {
        return this.taskService.getAllTask();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") String taskId) {
        return this.taskService.getTaskById(taskId);
    }

    @PostMapping
    public void insert(@RequestBody Task task) {
        this.taskService.insert(task);
    }

    @PutMapping
    public ResponseEntity<Task> update( @RequestBody Task task) {
        return new ResponseEntity<>(this.taskService.update(task), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String taskId) {
        this.taskService.deleteById(taskId);
    }
}