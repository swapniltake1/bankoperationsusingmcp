package com.demo.bank.repository;

import com.demo.bank.model.CardTransaction;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CardTransactionRepository extends JpaRepository<CardTransaction, Long> {
    
}
