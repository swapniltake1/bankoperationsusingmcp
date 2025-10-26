package com.demo.bank.service;

import com.demo.bank.model.ATM;
import com.demo.bank.repository.ATMRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ATMService {
    private final ATMRepository repo;
    public ATMService(ATMRepository repo){ this.repo = repo; }
    public List<ATM> getAllATMs(){ return repo.findAll(); }
}
