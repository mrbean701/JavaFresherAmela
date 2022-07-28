package com.example.specification.service;

import com.example.repository.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class TaskService implements ITaskService{

    @Autowired
    private ITaskRepository repository;

//    @SuppressWarnings("deprecation")
//    @Override
//    public Page<Task> getAllTasks(Pageable pageable,String search, TaskFilterForm filter) {
//        Specification<Task> where = null;
//        if(!StringUtils.isEmpty(search)){
//            TaskSpecification
//        }
//        return repository.findAll(pageable);
//    }

//    @Override
//    public Page<Task> getTaskByID(short id,Pageable pageable) {
//        return repository.findById(id,pageable);
//    }
//
//
//    @Override
//    public void createTask(Task task) {
//        repository.save(task);
//    }
//
//    @Override
//    public void updateTask(Task task) {
//        repository.save(task);
//    }
//
//    @Override
//    public void deleteTask(short id) {
//        repository.deleteById(id);
//    }
//
//    @Override
//    public boolean isTaskExistsByID(short id) {
//        return repository.existsById(id);
//    }
}
