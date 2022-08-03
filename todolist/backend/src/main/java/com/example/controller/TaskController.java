package com.example.controller;

import com.example.dto.DetailTaskDto;
import com.example.dto.TaskDto;
import com.example.model.Search;
import com.example.model.Status;
import com.example.model.Task;
import com.example.model.User;
import com.example.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value ="/tasks")
@CrossOrigin("*")
public class TaskController {
    @Autowired
    private ITaskService service;
    private Search search;

    @GetMapping
    public ModelAndView listTasks(@RequestParam(name="keyWord") String keyWord,
                                  @RequestParam(name="status") Status status,
                                  @PageableDefault(value = 5) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/tasks/task");
        Page<Task> tasks = null;
        if(StringUtils.hasText(keyWord)) {
            tasks = service.findByKeyword(keyWord, pageable);
        }else {
            tasks = service.findAll(pageable);
        }

        if (StringUtils.hasText("status")) {
            tasks = service.findTaskByStatus(status, pageable);
            modelAndView.addAllObjects("status", status);
        }
        modelAndView.addAllObjects("tasks", tasks);
        return modelAndView;
    }


//    @GetMapping()
//            public String getAllTasks(Model model,
//                @RequestParam(value = "page")Optional<Integer> page) {
//            {
//                if (SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString().compareTo("anonymousUser") == 0){
//                    return "Login.Html";
//                }
//                int currentPage = page.orElse(1);
//                int lengthTask = service.getTasksByKeyWord(search.status, search.title).size();
//                List<Integer> PageNumber = new ArrayList<>();
//                for(int i = 1; i < lengthTask; i+=10){
//                    if(Math.abs(currentPage-i) < 3){
//                        PageNumber.add(i);
//                    }
//                }
//        }
//        List<Task> entities = service.getAllTasks();
//int currentPage = page.orElse(1);
//int lengthTask = taskService.getAllTasks()

//        List<Task> listTask = taskService.




    @GetMapping(value = "/{status}")
    public ResponseEntity<?> getTaskByStatus(@PathVariable(name = "status") Status status) {

        Task entity = service.getTaskByStatus(status);

        DetailTaskDto dto = new DetailTaskDto(entity.getId(),entity.getTitle(), entity.getStatus(),
                new User(entity.getUser().getId(), entity.getUser().getFullName(),entity.getUser().getUserName()));
        ;

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

//    @PostMapping()
//    public ResponseEntity<?> createTask(@RequestBody TaskFormForCreating form){
//        service.createTask(form);
//        return new ResponseEntity<String>("Create succsessfully!", HttpStatus.CREATED);
//    }
//
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<?> updateTask(@PathVariable(name = "id") short id,
//                                              @RequestBody TaskFormForUpdating form) {
//        service.updateTask(id, task);
//        return new ResponseEntity<String>("Update successfully!", HttpStatus.OK);
//    }

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

//    @GetMapping(value = "/status/{status}")
//    public ResponseEntity<?> getTaskByStatus(@PathVariable(name= "status") Status status) {
//        service.getTaskByStatus(status);
//        return new ResponseEntity<String>("Get succsessfully!", HttpStatus.OK);
//    }
}
