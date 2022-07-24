package com.example.service;

import com.example.entity.Account;
import com.example.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public class AccountService implements IAccountService{
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Page<Account> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Account> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteAll() {

    }
}
