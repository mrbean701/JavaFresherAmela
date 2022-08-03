//package com.example.entity;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "`Task`")
//public class Task implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Column(name = "TaskID")
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private short id;
//
//    @Column(name = "Title", length = 100, nullable = false, unique = false)
//    private String title;
//
//    @Column(name = "`Status`", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private Status status;
//
//    @Column(name = "Content", length = 1000, nullable = false, unique = false)
//    private String content;
//
//    @ManyToOne
//    @JoinColumn(name = "creator",nullable = false)
//    private User user;
//
//    public Task() {
//    }
//
//    public Task(short id, String title, Status status, String content, User user) {
//        this.id = id;
//        this.title = title;
//        this.status = status;
//        this.content = content;
//        this.user = user;
//    }
//
//    public Task(String title) {
//    }
//
//    public short getId() {
//        return id;
//    }
//
//    public void setId(short id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}
