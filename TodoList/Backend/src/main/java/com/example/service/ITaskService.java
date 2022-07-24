package com.example.service;

import com.example.entity.Task;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ITaskService {
    List<Task> findAll();

    <S extends Task> Page<S> findAll(Example<S> example, Pageable pageable);

    Page<Task> findAll(Pageable pageable);

    List<Task> findAllById(int id);

    Optional<Task> findById(int id);

    void deleteById(int id);

    void deleteAll(Task task);
}
