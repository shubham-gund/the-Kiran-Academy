package com.tka.ipl;

public class Bank {
    private String bankName;
    private String branchCode;
    private String location;
    private int totalEmployees;

    public Bank() {
        // Default constructor
    }

    public Bank(String bankName, String branchCode, String location, int totalEmployees) {
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.location = location;
        this.totalEmployees = totalEmployees;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBranchCode() {
        return branchCode;
    }
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getTotalEmployees() {
        return totalEmployees;
    }
    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    @Override
    public String toString() {
        return "Bank{bankName='" + bankName + "', branchCode='" + branchCode + "', location='" + location + "', totalEmployees=" + totalEmployees + "}";
    }
}
