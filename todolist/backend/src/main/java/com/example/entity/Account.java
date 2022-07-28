package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "`Account`")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`Account`")
    private int id;

    @Column(name = "FullName", nullable = false)
    private String fullName;

    @Column(name ="UserName", nullable = false)
    private String userName;

    public Account() {
    }

    public Account(int id, String fullName, String userName) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
    }

    public Account(String userName, String password, String email) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
