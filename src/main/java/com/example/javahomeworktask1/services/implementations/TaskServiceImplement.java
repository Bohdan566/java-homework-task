package com.example.javahomeworktask1.services.implementations;


import com.example.javahomeworktask1.dao.ListTasksDAO;
import com.example.javahomeworktask1.dao.TaskDAO;
import com.example.javahomeworktask1.models.ListTasks;
import com.example.javahomeworktask1.models.Task;
import com.example.javahomeworktask1.services.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImplement implements TaskService {

    private ListTasksDAO listTasksDAO;
    private TaskDAO taskDAO;

    @Override
    public void saveTask(int id, Task task) {
        ListTasks one = listTasksDAO.getOne(id);
        Task saveTask = taskDAO.save(task);
        saveTask.setListTasks(one);
//        one.getTaskList().add(saveTask);
        listTasksDAO.save(one);

    }

    @Override
    public List<Task> findAllTasks(int id) {
        ListTasks one = listTasksDAO.getOne(id);
        return one.getTaskList();

    }

    @Override
    public Task findTaskByName(int id, String title) {

        System.out.println(title + "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Task task = taskDAO.findByTitle(title);

        System.out.println(task + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return task;
    }

    @Override
    public void deleteTask(int id) {
        taskDAO.deleteById(id);
    }

    @Override
    public Task updateTask(int id, Task task) {
        Task one = taskDAO.getOne(id);
        if(task.getTitle() != null){
            one.setTitle(task.getTitle());
        }else
            one.setTitle(one.getTitle());
        if(task.getBody() != null){
            one.setBody(task.getBody());
        }else
            one.setBody(one.getBody());
        if(task.getFinaldata() != 0){
            one.setFinaldata(task.getFinaldata());
        }else
            one.setFinaldata(one.getFinaldata());

        return taskDAO.save(one);
    }

    @Override
    public Task detailsTask(int id) {
        return taskDAO.getOne(id);
    }
}
