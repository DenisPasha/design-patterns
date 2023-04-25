package org.example.behavioral.observer;

public interface Observer {

     void subscribeToAShop(Publisher shop);

     void getNotified(String shopName);

}
