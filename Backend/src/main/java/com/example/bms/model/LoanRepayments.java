package com.example.bms.model;

import java.time.LocalDateTime;

public class LoanRepayments {
    private String repaymentId;
    private String loanId; // Links to a Loan
    private float amountPaid;
    private LocalDateTime repaymentDate;
    private RepaymentStatus repaymentStatus;

    // Constructor
    public LoanRepayments(String repaymentId, String loanId, float amountPaid,
            LocalDateTime repaymentDate, RepaymentStatus repaymentStatus) {
        this.repaymentId = repaymentId;
        this.loanId = loanId;
        this.amountPaid = amountPaid;
        this.repaymentDate = repaymentDate;
        this.repaymentStatus = repaymentStatus;
    }

    // Getters and Setters
    public String getRepaymentId() {
        return repaymentId;
    }

    public void setRepaymentId(String repaymentId) {
        this.repaymentId = repaymentId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDateTime getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(LocalDateTime repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public RepaymentStatus getRepaymentStatus() {
        return repaymentStatus;
    }

    public void setRepaymentStatus(RepaymentStatus repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
    }

  
}
