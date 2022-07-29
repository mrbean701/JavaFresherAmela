package com.example.controller;

import com.example.dto.TaskDto;
import com.example.entity.Task;
import com.example.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="api/v1/tasks")
@CrossOrigin("*")
public class TaskController {
    @Autowired
    private ITaskService service;

    @GetMapping()
    public ResponseEntity<?> getAllTasks() {
        List<Task> entities = service.getAllTasks();

        List<TaskDto> dtos = new ArrayList<>();

        for (Task entity : entities) {
            TaskDto dto = new TaskDto(entity.getId(), entity.getTitle(), entity.getStatus(), entity.getContent());

            dtos.add(dto);
        }

        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getTaskByID(@PathVariable(name= "id") short id){
        return new ResponseEntity<Task>(service.getTaskById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createTask(@RequestBody TaskDto dto){
        service.createTask(dto.toEntity());
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
}
