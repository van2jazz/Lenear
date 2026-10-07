package com.app.lenear;

import java.math.BigDecimal;

public sealed interface PaymentMethod permits CreditCard, BankTransfer, Wallet {
    void processPayment(BigDecimal amount);
}
