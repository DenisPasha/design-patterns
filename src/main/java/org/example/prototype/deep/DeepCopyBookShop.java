package org.example.prototype.deep;

import java.util.ArrayList;
import java.util.List;

public class DeepCopyBookShop {
    private List<BookDeep>bookDeepList;

    public DeepCopyBookShop() {
        this.bookDeepList = new ArrayList<>();
    }

    public List<BookDeep> getBookDeepList() {
        return bookDeepList;
    }

    public void setBookDeepList(List<BookDeep> bookDeepList) {
        this.bookDeepList = bookDeepList;
    }
}
