package com.example.dto;

import com.example.model.Status;
import com.example.model.User;

public class DetailTaskDto {
    private short id;

    private String title;

    private Status status;

    private String content;

    private User user;

    public DetailTaskDto(short id, String title, Status status, User user) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.content = content;
        this.user = user;
    }

    public short getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public String getContent() {
        return content;
    }

    public User getUser() {
        return user;
    }
}
