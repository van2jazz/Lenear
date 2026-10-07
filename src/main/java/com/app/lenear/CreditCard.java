package com.app.lenear;

import java.math.BigDecimal;

final class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

final class BankTransfer implements PaymentMethod {
    private String accountNumber;

    public BankTransfer(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Paid " + amount + " using Bank Transfer.");
    }
}

final class Wallet implements PaymentMethod {
    private String walletId;

    public Wallet(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Paid " + amount + " using Digital Wallet.");
    }
}
