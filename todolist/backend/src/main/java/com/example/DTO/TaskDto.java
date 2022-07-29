package com.example.dto;

import com.example.entity.Status;
import com.example.entity.Task;

public class TaskDto {
    private short id;

    private String title;

    private String content;

    private Status status;


    public TaskDto(short id, String title, Status status, String content) {
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

    public Task toEntity() {
        Task task = new Task();
        task.setId(id);
        task.setTitle(title);
        task.setContent(content);
        task.setStatus(status);
        return task;
    }
}
