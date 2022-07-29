package com.example.repository;

import com.example.entity.Status;
import com.example.entity.Task;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ITaskRepository  extends JpaRepository<Task, Short> {

    public Task findByStatus(Status status);

    public Task findByTitle(String title);
    public boolean existsByTitle(String title);

    public boolean existsById(short id);
}
