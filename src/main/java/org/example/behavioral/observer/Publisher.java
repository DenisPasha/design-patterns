package org.example.behavioral.observer;

public interface Publisher {
    void addCustomer(Customer customer);

    void removeCustomer(Customer customer);

    void notifyCustomers();
}
