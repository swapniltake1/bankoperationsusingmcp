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
@Table(name = "transactions")
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long txnId;
    private String txnType;
    private Double amount;
    private LocalDateTime txnDate;
    private String description;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;

    // Getters and setters
}
