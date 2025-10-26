package com.demo.bank.service;

import com.demo.bank.model.Loan;
import com.demo.bank.repository.LoanRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoanService {
    private final LoanRepository repo;
    public LoanService(LoanRepository repo){ this.repo = repo; }
    public List<Loan> getAllLoans(){ return repo.findAll(); }
}
