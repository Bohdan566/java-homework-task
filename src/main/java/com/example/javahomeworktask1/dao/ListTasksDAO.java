package com.example.javahomeworktask1.dao;

import com.example.javahomeworktask1.models.ListTasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListTasksDAO extends JpaRepository<ListTasks, Integer> {
}
