package com.example.service;

import com.example.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IAccountService {
    abstract List<Account> findAll();

    abstract Page<Account> findAll(Pageable pageable);

    abstract Optional   <Account> findById(int id);

    abstract void deleteAll();
}
