package com.demo.bank.service;

import com.demo.bank.model.Account;
import com.demo.bank.repository.AccountRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import java.io.FileOutputStream;
import java.util.List;

@Service
public class AccountService {
    private final AccountRepository repo;
    public AccountService(AccountRepository repo){ this.repo = repo; }

    public List<Account> getHighBalanceAccounts(Double minBalance){
        return repo.findByBalanceGreaterThanEqual(minBalance);
    }

    public String generateHighBalanceReport(Double minBalance){
        List<Account> accounts = getHighBalanceAccounts(minBalance);
        String filePath = "HighBalanceAccounts.xlsx";

        try(Workbook workbook = new XSSFWorkbook()){
            Sheet sheet = workbook.createSheet("High Balance Accounts");
            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("Account ID");
            header.createCell(1).setCellValue("Customer ID");
            header.createCell(2).setCellValue("Branch ID");
            header.createCell(3).setCellValue("Type");
            header.createCell(4).setCellValue("Balance");

            int rowNum=1;
            for(Account a : accounts){
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(a.getAccountId());
                row.createCell(1).setCellValue(a.getCustomer().getCustomerId());
                row.createCell(2).setCellValue(a.getBranch().getBranchId());
                row.createCell(3).setCellValue(a.getAccountType());
                row.createCell(4).setCellValue(a.getBalance());
            }

            try(FileOutputStream out = new FileOutputStream(filePath)){ workbook.write(out); }
        }catch(Exception e){ e.printStackTrace(); }

        return filePath;
    }
}
