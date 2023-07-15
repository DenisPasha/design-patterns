package org.example.behavioral.state;

public class Main {
    public static void main(String[] args) {
        // by default phone is off
        Phone phone = new Phone();

        // pressing the power button to switch the state to locked
        System.out.println(phone.state.powerButton());
        // pressing the power button to switch the state to ready
        System.out.println(phone.state.homeButton());
        // pressing the power button to switch the state to off
        System.out.println(phone.state.powerButton());
    }
}
