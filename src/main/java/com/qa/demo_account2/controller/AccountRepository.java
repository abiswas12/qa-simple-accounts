package com.qa.demo_account2.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.demo_account2.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
