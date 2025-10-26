package com.demo.bank.repository;
import com.demo.bank.model.LoanPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanPaymentRepository extends JpaRepository<LoanPayment, Integer> {}