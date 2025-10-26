package com.demo.bank.service;

import com.demo.bank.model.LoanPayment;
import com.demo.bank.repository.LoanPaymentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoanPaymentService {
    private final LoanPaymentRepository repo;
    public LoanPaymentService(LoanPaymentRepository repo){ this.repo = repo; }
    public List<LoanPayment> getAllPayments(){ return repo.findAll(); }
}
