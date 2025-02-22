package com.example.bms.model;

import java.time.LocalDate;

public class Cards {
    private String cardId;
    private String customerId; // Links the card to a Customer
    private CardType cardType; // Enum (e.g., CREDIT, DEBIT)
    private String cardNumber;
    private LocalDate expiryDate;
    private int cvv;
    private float cardLimit; // Limit for credit cards

    // Constructor
    public Cards(String cardId, String customerId, CardType cardType,
            String cardNumber, LocalDate expiryDate, int cvv, float cardLimit) {
        this.cardId = cardId;
        this.customerId = customerId;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardLimit = cardLimit;
    }

    // Getters and Setters
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public float getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(float cardLimit) {
        this.cardLimit = cardLimit;
    }

   
}
