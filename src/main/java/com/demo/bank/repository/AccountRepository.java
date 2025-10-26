package com.demo.bank.repository;

import com.demo.bank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    List<Account> findByBalanceGreaterThanEqual(Double minBalance);
}