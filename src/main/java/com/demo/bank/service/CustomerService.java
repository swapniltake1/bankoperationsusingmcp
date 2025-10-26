package com.demo.bank.service;

import com.demo.bank.model.Customer;
import com.demo.bank.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repo;
    public CustomerService(CustomerRepository repo){ this.repo = repo; }
    public List<Customer> getAllCustomers(){ return repo.findAll(); }
}
