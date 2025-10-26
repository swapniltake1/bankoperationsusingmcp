package com.demo.bank.service;

import com.demo.bank.model.Transaction;
import com.demo.bank.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository repo;
    public TransactionService(TransactionRepository repo){ this.repo = repo; }

    public List<Transaction> getTransactionsBetween(LocalDateTime start, LocalDateTime end){
        return repo.findByTxnDateBetween(start, end);
    }
}
