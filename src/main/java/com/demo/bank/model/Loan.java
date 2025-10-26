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
@Table(name = "loans")
public class Loan {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loanId;
    private String loanType;
    private Double loanAmount;
    private Float interestRate;
    private LocalDate startDate;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="branch_id")
    private Branch branch;

    @OneToMany(mappedBy="loan")
    private List<LoanPayment> payments;

    // Getters and setters
}
