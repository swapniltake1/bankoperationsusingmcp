package com.demo.bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "card_transactions")
public class CardTransaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardTxnId;
    private Double amount;
    private LocalDateTime txnDate;
    private String merchantName;
    private String city;

    @ManyToOne
    @JoinColumn(name="card_id")
    private Card card;

    // Getters and setters
}
