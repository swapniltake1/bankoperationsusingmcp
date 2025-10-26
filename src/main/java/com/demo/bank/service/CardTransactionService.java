package com.demo.bank.service;

import com.demo.bank.model.CardTransaction;
import com.demo.bank.repository.CardTransactionRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CardTransactionService {
    private final CardTransactionRepository repo;
    public CardTransactionService(CardTransactionRepository repo){ this.repo = repo; }
    public List<CardTransaction> getCardTransactionsBetween(LocalDateTime start, LocalDateTime end) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCardTransactionsBetween'");
    }
    
}
