package com.example.entity;

import javax.persistence.*;
import java.util.EnumSet;

@Entity
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TaskID", nullable = false)
    private int id;

    @Column(name = "Title", nullable = false)
    private String title;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "`Status`", nullable = false)
    private Status status = Status.Open;

    @Column(name = "Content", nullable = false)
    private String content;

    @Column(name = "Creator", nullable = false)
    private int creator;

    public Task() {
    }

    public Task(int id, String title, Status status, String content, int creator) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.content = content;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }
}
