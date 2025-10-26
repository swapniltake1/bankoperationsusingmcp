package com.demo.bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "loan_payments")
public class LoanPayment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;
    private LocalDate paymentDate;
    private Double paymentAmount;

    @ManyToOne
    @JoinColumn(name="loan_id")
    private Loan loan;

    // Getters and setters
}
