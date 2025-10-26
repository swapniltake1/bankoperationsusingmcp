package com.demo.bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cards")
public class Card {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cardId;
    private String cardType;
    private String cardNumber;
    private LocalDate expiryDate;
    private String cvv;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    @OneToMany(mappedBy="card")
    private List<CardTransaction> transactions;

    // Getters and setters
}
