package com.example.form;

import com.example.entity.Status;
import com.example.entity.User;

public class TaskFormForCreating {
    private String title;

    private Status status;

    private String content;

    private User userId;

    public TaskFormForCreating() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
