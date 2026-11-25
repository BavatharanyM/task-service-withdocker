package com.taskservice.taskservicewithdocker.controller;

import com.taskservice.taskservicewithdocker.entity.Task;
import com.taskservice.taskservicewithdocker.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private final TaskService taskService;

    // construction injection
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/api/task")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task saved = taskService.createTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/api/tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }


}
