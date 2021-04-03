package com.example.javahomeworktask1.controllers;


import com.example.javahomeworktask1.models.Task;
import com.example.javahomeworktask1.services.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/lists")
public class TaskController {

    private TaskService taskService;

    @PostMapping("/{id}saveToDo")
    public void savaTask(@PathVariable int id, @RequestBody Task task){
        taskService.saveTask(id, task);
    }

    @GetMapping("/{id}")
    public List<Task> findAllTasks(@PathVariable int id){
        return taskService.findAllTasks(id);
    }

    @PostMapping("/{id}")
    public Task findTaskByName(@PathVariable int id, @RequestBody String title){
       return taskService.findTaskByName(id, title);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id){
        taskService.deleteTask(id);
    }

    @PostMapping("/{id}update")
    public void updateTask(@PathVariable int id, @RequestBody Task task){
        taskService.updateTask(id, task);
    }

    @GetMapping("/{id}details")
    public void detailsTask(@PathVariable int id){
        taskService.detailsTask(id);
    }
}
