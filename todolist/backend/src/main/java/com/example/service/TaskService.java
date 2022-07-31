package com.example.service;

import com.example.entity.Status;
import com.example.entity.Task;
import com.example.entity.User;
import com.example.form.TaskFormForCreating;
import com.example.repository.ITaskRepository;
import com.example.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements ITaskService{

    @Autowired
    private ITaskRepository taskRepository;

    @Autowired
    private IUserRepository userRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(short id) {
        return taskRepository.findById(id).get();
    }

    public Task getTaskByStatus (Status status){
        return taskRepository.findByStatus(status);
    }

    public void createTask(TaskFormForCreating form){

        User user = userRepository.findById(form.getUserId()).get();

        Task task = new Task(form.getTitle());
        task.setUser(user);

        taskRepository.save(task);
    }

    public void updateTask(Task task){
        taskRepository.save(task);
    }

    public void deleteTask(short id){
        taskRepository.deleteById(id);
    }

    public boolean isTaskExistsByID (short id){
        return taskRepository.existsById(id);
    }

    public boolean isTaskExistsByTitle (String title){
        return taskRepository.existsByTitle(title);
    }

    public Task getTaskByTitle(String title){
        return taskRepository.findByTitle(title);
    }
}
