package com.app.lenear;

import java.math.BigDecimal;

public class FeeCalculator {

    public BigDecimal calculateFee(PaymentMethod method, BigDecimal amount) {
        // Java 21 switch expression mapping types to fee percentages
        BigDecimal feePercentage = switch (method) {
            case CreditCard cc ->new BigDecimal("0.025") ;
            case BankTransfer bt -> new BigDecimal("0.010");
            case Wallet w -> new BigDecimal("0.005");
        };

        return amount.multiply(feePercentage);
    }
}

