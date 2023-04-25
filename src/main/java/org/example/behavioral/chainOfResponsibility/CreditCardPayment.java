package org.example.behavioral.chainOfResponsibility;

public class CreditCardPayment extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount <=1000){
            System.out.println("Handled by credit card");
        }else {
            next.handlePayment(amount);
        }
    }
}
