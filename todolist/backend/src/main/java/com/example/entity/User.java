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

}
