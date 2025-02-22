package com.example.bms.model;

public class Employees {
    private String eId;
    private String bId;
    private String firstName;
    private String lastName;
    private String role;
    private String email;
    private String phoneNumber;
    private String address;
    private float salary;

    // Constructor
    public Employees(String eId, String bId, String firstName, String lastName, String role,
            String email, String phoneNumber, String address, float salary) {
        this.eId = eId;
        this.bId = bId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Getters and Setters
    public String getId() {
        return eId;
    }

    public void setId(String eId) {
        this.eId = eId;
    }

    public String getBId() {
        return bId;
    }

    public void setBId(String bId) {
        this.bId = bId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
