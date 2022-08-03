package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Task")
public class Task {
    @Id
    @Column(name = "TaskID")
    short id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Status")
    private Status status;

    @Column(name = "Content")
    private String content;

    @Column(name = "Creator")
    private User user;

    public Task() {
    }

    public Task(short id, String title, Status status, String content, User user) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.content = content;
        this.user = user;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
