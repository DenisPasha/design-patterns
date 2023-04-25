package org.example.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        Paypal paypal = new Paypal();

        // chaining the handlers
        bank.setNext(creditCardPayment);
        creditCardPayment.setNext(paypal);

        bank.handlePayment(100);
        bank.handlePayment(600);
        bank.handlePayment(10000);


    }
}
