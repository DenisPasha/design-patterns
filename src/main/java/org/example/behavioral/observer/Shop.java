package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Publisher {
    private String name ;
    private List<Customer> customers;

    public Shop(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    @Override
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    @Override
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    @Override
    public void notifyCustomers(){
        customers.forEach(customer -> customer.getNotified(name));
    }

}
