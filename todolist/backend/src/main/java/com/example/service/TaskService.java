package com.example.service;

import com.example.entity.Status;
import com.example.entity.Task;
import com.example.entity.User;
import com.example.repository.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements ITaskService{

    @Autowired
    private ITaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    @Override
    public Task getTaskById(short id) {
        return repository.findById(id).get();
    }

    public Task getTaskByStatus (Status status){
        return repository.findByStatus(status);
    }

    public void createTask(Task task){
        repository.save(task);
    }

    public void updateTask(Task task){
        repository.save(task);
    }

    public void deleteTask(short id){
        repository.deleteById(id);
    }

    public boolean isTaskExistsByID (short id){
        return repository.existsById(id);
    }

    public boolean isTaskExistsByTitle (String title){
        return repository.existsByTitle(title);
    }
}
