package org.example.behavioral.observer;

public class Main {
    public static void main(String[] args) {

        Customer customerDenis = new Customer("Denis");
        Customer customerPesho = new Customer("Pesho");
        Customer customerNatasha = new Customer("Natasha");

        Shop shop = new Shop("Gym-equipment.com");

        // adding listeners - observers to the subject
        shop.addCustomer(customerDenis);
        shop.addCustomer(customerPesho);
        shop.addCustomer(customerNatasha);




        customerDenis.subscribeToAShop(shop);
        customerPesho.subscribeToAShop(shop);
        customerNatasha.subscribeToAShop(shop);

        shop.removeCustomer(customerDenis);

        shop.notifyCustomers();

    }
}
