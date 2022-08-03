package com.example.service;


import com.example.model.Status;
import com.example.model.Task;
import com.example.repository.ITaskRepository;
import com.example.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        return taskRepository.findById(id).get(id);
    }

    @Override
    public Task getTaskByStatus(Status status) {
        return null;
    }


    @Override
    public Page<Task> findTaskByStatus(Status status, Pageable pageable) {
        return taskRepository.findTaskByStatus(status, pageable);
    }

    public Task getTaskByTitle(String title){
        return taskRepository.findByTitle(title);
    }

//    @Override
//    public void createTask(TaskFormForCreating form) {
//
//    }

    @Override
    public Task updateTask(short id, Task task) {
        return null;
    }


//    public List<Task> findPaginated(int pageable, Status status, String keyword){
//        List<Task> tasks = getListTaskByKeyWord(status, keyword);
//        int length = tasks.size();
//        return tasks.subList((pageable - 1) * 5, pageable * 5 >= length ? length : pageable * 5);
//    }
//
//    private List<Task> getListTaskByKeyWord(Status status, String keyword) {
//        if(status == null){
//            return taskRepository.findById(Progress.ge)
//        }
//    }

//    public void createTask(TaskFormForCreating form){
//
//        User user = userRepository.findById(form.getUserId()).get();
//
//        Task task = new Task(form.getTitle());
//        task.setUser(user);
//
//        taskRepository.save(task);
//    }


    public Task updateTask(Task task, short id ){
        task.setId(id);
        return taskRepository.save(task);
    }

    public void deleteTask(short id){
        taskRepository.deleteById(id);
    }

    public boolean isTaskExistsByID (short id){
        return taskRepository.existsById(id);
    }

//    public boolean isTaskExistsByTitle (String title){
//        return taskRepository.existsByTitle(title);
//    }



    @Override
    public List<Task> getTasksByKeyWord(Status status, String keyword) {
        return null;
    }

    @Override
    public Page<Task> findByKeyword(String keyword, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Task> findAll(Pageable pageable) {
        return null;
    }

}
