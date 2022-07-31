package com.example.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "`User`")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "UserID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "FullName", length = 100, nullable = false, unique = false)
    private String fullName;

    @Column(name = "UserName", length = 100, nullable = false, unique = true)
    private String userName;

    @Column(name = "`PassWord`", length = 1000, nullable = false, unique = false)
    private String password;

    public User() {
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User get() {
        return get();
    }
}
