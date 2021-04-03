package com.example.javahomeworktask1.controllers;


import com.example.javahomeworktask1.dao.ListTasksDAO;
import com.example.javahomeworktask1.models.ListTasks;
import com.example.javahomeworktask1.models.Task;
import com.example.javahomeworktask1.services.ListTasksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
//@CrossOrigin(origins = {"http://localhost:4200"})
public class ListTasksController {

    private ListTasksService listTasksService;

    @PostMapping("/save")
    public void saveList(@RequestBody ListTasks listTasks){
        listTasksService.saveList(listTasks);
    }


    @GetMapping("/")
    public List<ListTasks> getAll(){
        return listTasksService.getAll();
    }

    @GetMapping("/{id}")
    public void getOneList(@PathVariable int id){
        listTasksService.getOneList(id);
    }

    @DeleteMapping("/{id}")
    public void deleteList(@PathVariable int id){
        listTasksService.deleteList(id);
    }

    @PostMapping("/{id}update")
    public void updateList(@PathVariable int id, @RequestBody ListTasks listTasks){
        listTasksService.updateList(id, listTasks);
    }
}
