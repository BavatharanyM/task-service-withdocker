package com.taskservice.taskservicewithdocker.repository;

import com.taskservice.taskservicewithdocker.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long > {
}
