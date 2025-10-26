package com.demo.bank.repository;

import com.demo.bank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByTxnDateBetween(LocalDateTime start, LocalDateTime end);
}
