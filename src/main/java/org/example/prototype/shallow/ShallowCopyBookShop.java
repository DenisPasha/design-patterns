package org.example.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopyBookShop {
    private List<BookShallow> bookShallowList;


    public ShallowCopyBookShop() {
        this.bookShallowList = new ArrayList<>();
    }

    public List<BookShallow> getBookShallowList() {
        return bookShallowList;
    }

    public void setBookShallowList(List<BookShallow> bookShallowList) {
        this.bookShallowList = bookShallowList;
    }
}
