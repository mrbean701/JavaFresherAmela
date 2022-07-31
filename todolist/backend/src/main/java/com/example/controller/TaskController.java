package com.example.controller;

import com.example.dto.TaskDto;
import com.example.entity.Status;
import com.example.entity.Task;
import com.example.form.TaskFormForCreating;
import com.example.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value ="api/v1/tasks")
@CrossOrigin("*")
public class TaskController {
    @Autowired
    private ITaskService service;

    @GetMapping()
    public ResponseEntity<?> getAllTasks() {
        List<Task> entities = service.getAllTasks();

//        List<TaskDto> dtos = new ArrayList<>();
//
//        for (Task entity : entities) {
//            TaskDto dto = new TaskDto(entity.getId(), entity.getTitle(), entity.getStatus(), entity.getContent());
//
//            dtos.add(dto);
//        }

        return new ResponseEntity<List<Task>>(entities, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getTaskByID(@PathVariable(name= "id") short id){
        return new ResponseEntity<Task>(service.getTaskById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createTask(@RequestBody TaskFormForCreating form){
        service.createTask(form);
        return new ResponseEntity<String>("Create succsessfully!", HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updateTask(@PathVariable(name= "id") short id, @RequestBody TaskDto dto) {
        Task task = dto.toEntity();

        task.setId(id);
        service.updateTask(task);

        return new ResponseEntity<String>("Update successfully!", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable(name= "id") short id){
        service.deleteTask(id);
        return new ResponseEntity<String>("Delete succsessfully!", HttpStatus.OK);
    }

    @GetMapping(value = "/title/{title}")
    public ResponseEntity<?> getTasksTitle(@PathVariable(name= "title")String title){
        service.getTaskByTitle(title);
        return new ResponseEntity<String>("Get succsessfully!", HttpStatus.OK);
    }

    @GetMapping(value = "/status/{status}")
    public ResponseEntity<?> getTaskByStatus(@PathVariable(name= "status") Status status) {
        service.getTaskByStatus(status);
        return new ResponseEntity<String>("Get succsessfully!", HttpStatus.OK);
    }
}
