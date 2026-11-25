package com.taskservice.taskservicewithdocker.service;

import com.taskservice.taskservicewithdocker.entity.Task;
import com.taskservice.taskservicewithdocker.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    TaskRepository taskRepository;
    @Override
    public Task createTask(Task task) {
        task.setId(null);                 // make sure a new row is created
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
