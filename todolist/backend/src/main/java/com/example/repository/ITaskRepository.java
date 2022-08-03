package com.example.repository;

import com.example.model.Status;
import com.example.model.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface ITaskRepository  extends JpaRepository<Task, Short> {
    @Override
    List<Task> findAll();

    List<Task> findById(short id);
    @Query("SELECT t FROM Task t WHERE t.id = ?1")
    List<Task> findByStatus(Status status);
    @Query("SELECT t FROM Task t WHERE t.title = ?1")
    public Task findByTitle(String title);

    @Query("SELECT t FROM Task t WHERE t.status = ?1")
    Page<Task> findTaskByStatus(Status status, Pageable pageable);

//    public boolean existsByTitle(String title);
//
//    public boolean existsById(short id);
}
