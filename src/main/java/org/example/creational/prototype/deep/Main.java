package org.example.creational.prototype.deep;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        //deep copy
        // copying by value not by reference
        BookDeep book = new BookDeep();

        book.setId(1);
        book.setName("name");
        book.setAuthor("author");

        DeepCopyBookShop bookShop = new DeepCopyBookShop();
        bookShop.getBookDeepList().add(book);

        BookDeep clone = book.clone();
        clone.setId(12);
        clone.setName("another name");
        clone.setAuthor("another author");

        bookShop.getBookDeepList().add(clone);


    }




}
