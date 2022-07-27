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
    private Integer id;

    @Column(name = "FullName", length = 100, nullable = false, unique = false)
    private String fullName;

    @Column(name = "userName", length = 100, nullable = false, unique = true)
    private String userName;

    @Column(name = "password", length = 12, nullable = false, unique = false)
    private String password;

    public User() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString() {
        return "User [id=" + id + ", fullName=" + fullName + ", userName=" + userName + ", password=" + password + "]";
    }

}
