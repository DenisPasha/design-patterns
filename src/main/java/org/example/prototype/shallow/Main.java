package org.example.prototype.shallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Shallow copy
        // copying the reference
        BookShallow bookShallow = new BookShallow();
        bookShallow.setId(1);
        bookShallow.setName("book name");
        bookShallow.setAuthor("book author");

        ShallowCopyBookShop bookShop = new ShallowCopyBookShop();
        bookShop.getBookShallowList().add(bookShallow);
        bookShallow.setId(31);
        bookShallow.setAuthor("another author");
        bookShallow.setName("another name");

        bookShop.getBookShallowList().add(bookShallow);



    }
}
