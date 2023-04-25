package org.example.behavioral.chainOfResponsibility;

public class Bank extends PaymentHandler {


    @Override
    public void handlePayment(double amount) {
        if (amount <= 500){
            System.out.println("Handled by the bank");
        }else {
            next.handlePayment(amount);
        }
    }
}
