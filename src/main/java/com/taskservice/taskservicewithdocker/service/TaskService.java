package com.taskservice.taskservicewithdocker.service;

import com.taskservice.taskservicewithdocker.entity.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);

    List<Task> getAllTasks();
}
