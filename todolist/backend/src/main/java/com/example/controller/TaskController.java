package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="api/v1/tasks")
public class TaskController {

//    @Autowired
//    private ITaskService service;
//
//    @GetMapping()
//    public Page<Task> getAllTasks(Pageable pageable) {
//        return service.getAllTasks(pageable);
//    }
//
////    @GetMapping(value = "/{id}")
////    public Page<Task> getTaskByID(@PathVariable(name = "id") short id, Pageable pageable) {
////        return service.getTaskByID(pageable, id);
////    }
//
//    @PostMapping()
//    public void createTask(@RequestBody TaskForm form){
//        service.createTask(form.toEntity());
//    }
//
//    @PutMapping(value = "/{id}")
//    public void updateTask(@PathVariable(name = "id") Short id, String title, String content, Status status,  @RequestBody TaskForm form){
//        Task task = form.toEntity();
//        task.setId(id);
//        task.setTitle(title);
//        task.setContent(content);
//        task.setStatus(status);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public void deleteTask(@PathVariable(name = "id") Short id){
//        service.deleteTask(id);
//    }
}
