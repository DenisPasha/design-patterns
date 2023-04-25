package org.example.behavioral.chainOfResponsibility;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Paypal extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        System.out.println("Handled by Paypal");
    }
}
