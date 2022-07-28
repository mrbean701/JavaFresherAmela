package com.example.repository;

import com.example.entity.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITaskRepository  extends JpaRepository<Task, Short> {
    Page<Task> findById(short id, Pageable pageable);
}
