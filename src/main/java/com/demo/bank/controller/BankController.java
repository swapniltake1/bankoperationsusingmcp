package com.demo.bank.controller;

import com.demo.bank.model.*;
import com.demo.bank.service.*;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BankController {

    private final CustomerService customerService;
    private final AccountService accountService;
    private final TransactionService transactionService;
    private final LoanService loanService;
    private final LoanPaymentService loanPaymentService;
    private final CardService cardService;
    private final CardTransactionService cardTransactionService;
    private final BranchService branchService;
    private final EmployeeService employeeService;
    private final ATMService atmService;

    public BankController(CustomerService customerService, AccountService accountService,
                          TransactionService transactionService, LoanService loanService,
                          LoanPaymentService loanPaymentService, CardService cardService,
                          CardTransactionService cardTransactionService, BranchService branchService,
                          EmployeeService employeeService, ATMService atmService) {
        this.customerService = customerService;
        this.accountService = accountService;
        this.transactionService = transactionService;
        this.loanService = loanService;
        this.loanPaymentService = loanPaymentService;
        this.cardService = cardService;
        this.cardTransactionService = cardTransactionService;
        this.branchService = branchService;
        this.employeeService = employeeService;
        this.atmService = atmService;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){ return customerService.getAllCustomers(); }

    @GetMapping("/accounts/high-balance")
    public List<Account> getHighBalanceAccounts(@RequestParam Double minBalance){
        return accountService.getHighBalanceAccounts(minBalance);
    }

    @GetMapping("/accounts/high-balance-report")
    public String generateHighBalanceReport(@RequestParam Double minBalance){
        return accountService.generateHighBalanceReport(minBalance);
    }

    @GetMapping("/transactions")
    public List<Transaction> getTransactions(@RequestParam LocalDateTime start, @RequestParam LocalDateTime end){
        return transactionService.getTransactionsBetween(start,end);
    }

    @GetMapping("/loans")
    public List<Loan> getLoans(){ return loanService.getAllLoans(); }

    @GetMapping("/loan-payments")
    public List<LoanPayment> getLoanPayments(){ return loanPaymentService.getAllPayments(); }

    @GetMapping("/cards")
    public List<Card> getCards(){ return cardService.getAllCards(); }

    @GetMapping("/card-transactions")
    public List<CardTransaction> getCardTransactions(@RequestParam LocalDateTime start, @RequestParam LocalDateTime end){
        return cardTransactionService.getCardTransactionsBetween(start,end);
    }

    @GetMapping("/branches")
    public List<Branch> getBranches(){ return branchService.getAllBranches(); }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){ return employeeService.getAllEmployees(); }

    @GetMapping("/atms")
    public List<ATM> getATMs(){ return atmService.getAllATMs(); }
}
