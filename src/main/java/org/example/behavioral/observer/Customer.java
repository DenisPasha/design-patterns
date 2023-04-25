package org.example.behavioral.observer;

public class Customer implements Observer {

    private String name;
    private Shop shop;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void subscribeToAShop(Shop shop) {
        this.shop = shop;
    }


    @Override
    public void getNotified(String shopName) {
        System.out.println("Dear "+name+ " we are please to inform you that " +shopName+ " has new arrivals");
    }


}
