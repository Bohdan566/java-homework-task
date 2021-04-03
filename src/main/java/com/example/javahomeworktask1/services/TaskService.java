package com.example.javahomeworktask1.services;

import com.example.javahomeworktask1.models.ListTasks;
import com.example.javahomeworktask1.models.Task;

import java.util.List;

public interface TaskService {

    void saveTask(int id, Task task);

    List<Task> findAllTasks(int id);

    Task findTaskByName(int id, String title);

    void deleteTask(int id);

    Task updateTask(int id, Task task);

    Task detailsTask(int id);
}
