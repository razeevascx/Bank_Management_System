package com.example.bms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Account")

public class Account {
    @Id
    @Column(unique = true)
    private String accountId;
    private User customer;
    private double balance;
    private String accountType; 

    // Constructor
    public Account(String accountId, User customer, double balance, String accountType) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Getters and Setters
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    
}
