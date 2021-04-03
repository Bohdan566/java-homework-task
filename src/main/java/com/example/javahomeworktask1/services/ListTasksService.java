package com.example.javahomeworktask1.services;

import com.example.javahomeworktask1.models.ListTasks;
import com.example.javahomeworktask1.models.Task;

import java.util.List;

public interface ListTasksService {
    void saveList(ListTasks listTasks);

    List<ListTasks> getAll();

    ListTasks getOneList(int id);

    void deleteList(int id);

    void updateList(int id, ListTasks listTasks);

}
