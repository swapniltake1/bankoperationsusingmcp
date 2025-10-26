package com.demo.bank.repository;
import com.demo.bank.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface CardRepository extends JpaRepository<Card, Integer> {
    List<Card> findByCardNumber(String cardNumber);
    
}