package com.example.bms.model;

public class Branches {
    private String branchId;
    private String branchName;
    private String branchLocation;
    private String branchCode;
    private String managerId;

    // Constructor
    public Branches(String branchId, String branchName, String branchLocation,
            String branchCode, String managerId) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.branchLocation = branchLocation;
        this.branchCode = branchCode;
        this.managerId = managerId;
    }

    // Getters and Setters
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

}
