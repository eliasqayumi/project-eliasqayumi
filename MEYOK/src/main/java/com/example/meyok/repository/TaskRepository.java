package com.example.meyok.repository;

import com.example.meyok.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task,String> {
    Optional<Task> findTaskById(String taskId);
}
