package com.example.service;


import com.example.model.Status;
import com.example.model.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ITaskService  {

    public List<Task> getAllTasks();

    public Task getTaskById(short id);

//    public void createTask(TaskFormForCreating form);

    Task getTaskByStatus(Status status);

    public Task updateTask(short id, Task task);
    public void deleteTask(short id);

//    public boolean isTaskExistsByID(short id);
//
//    public boolean isTaskExistsByTitle(String title);

    public Task getTaskByTitle(String title);

    public List<Task> getTasksByKeyWord(Status status, String keyword);

    Page<Task> findByKeyword(String keyword, Pageable pageable);

    Page<Task> findAll(Pageable pageable);

    Page<Task> findTaskByStatus(Status status, Pageable pageable);
}
