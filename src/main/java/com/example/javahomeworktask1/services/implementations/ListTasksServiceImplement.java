package com.example.javahomeworktask1.services.implementations;

import com.example.javahomeworktask1.dao.ListTasksDAO;
import com.example.javahomeworktask1.models.ListTasks;
import com.example.javahomeworktask1.models.Task;
import com.example.javahomeworktask1.services.ListTasksService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class ListTasksServiceImplement implements ListTasksService {

    private ListTasksDAO listTasksDAO;

    @Override
    public void saveList(ListTasks listTasks) {
        listTasksDAO.save(listTasks);
    }


    @Override
    public List<ListTasks> getAll() {
        return listTasksDAO.findAll();
    }

    @Override
    public ListTasks getOneList(int id) {
        return listTasksDAO.getOne(id);
    }


    @Override
    public void deleteList(int id) {
        listTasksDAO.deleteById(id);
    }

    @Override
    public void updateList(int id, ListTasks listTasks) {
        ListTasks list = listTasksDAO.getOne(id);
        list.setTitle(listTasks.getTitle());
        listTasksDAO.save(list);
    }

}
