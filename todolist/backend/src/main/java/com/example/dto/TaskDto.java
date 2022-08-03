package com.example.dto;

import com.example.entity.Status;
import com.example.entity.User;

public class TaskDto {
    private short id;

    private String title;

    private String content;

    private Status status;

    private UserDto user;

    public TaskDto(short id, String title, String content, Status status, UserDto user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.status = status;
        this.user = user;
    }

    public TaskDto(String title, Status status) {
    }

    public TaskDto(short id, String title, Status status, User user) {
    }

    public short getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Status getStatus() {
        return status;
    }

    public UserDto getUser() {
        return user;
    }
//    public Task toEntity() {
//        Task task = new Task();
//        task.setId(id);
//        task.setTitle(title);
//        task.setContent(content);
//        task.setStatus(status);
//        task.setUser(user);
//        return task;
//    }
}
