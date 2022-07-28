package com.example.specification.service;

import com.example.entity.Task;
import com.example.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface ITaskService extends UserDetailsService {

    User getUserByUsername(String username);
//    public Page<Task> getAllTasks(Pageable pageable);
//
//
//    Page<Task> getTaskByID(Pageable pageable, short id);
//
//    Page<Task> getTaskByID(short id, Pageable pageable);
//
//    public void createTask(Task task);
//
//    public void updateTask(Task task);
//
//    public void deleteTask(short id);
//
//    public boolean isTaskExistsByID(short id);
//

}
