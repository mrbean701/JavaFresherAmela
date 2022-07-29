package com.example.service;


import com.example.entity.Status;
import com.example.entity.Task;

import java.util.List;

public interface ITaskService  {

    public List<Task> getAllTasks();

    public Task getTaskById(short id);

    public Task getTaskByStatus(Status status);

    public void createTask(Task task);

    public void updateTask(Task task);

    public void deleteTask(short id);

    public boolean isTaskExistsByID(short id);

    public boolean isTaskExistsByTitle(String title);
}
