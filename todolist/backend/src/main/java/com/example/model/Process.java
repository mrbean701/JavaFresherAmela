package com.example.model;

import org.springframework.security.core.context.SecurityContextHolder;

public class Process {
    public static short id;
    public static String userName;

    public short getId() {
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
    }

    public String getUserName() {
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUserName();
    }
}
