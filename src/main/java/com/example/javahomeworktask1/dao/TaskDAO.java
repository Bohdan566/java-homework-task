package com.example.javahomeworktask1.dao;

import com.example.javahomeworktask1.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskDAO extends JpaRepository<Task, Integer> {
    Task findByTitle(String title);
}
