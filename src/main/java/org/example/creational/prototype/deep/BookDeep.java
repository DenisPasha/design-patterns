package org.example.creational.prototype.deep;

public class BookDeep implements Cloneable{
    private String name;
    private int Id;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    protected BookDeep clone() throws CloneNotSupportedException {
        BookDeep book = new BookDeep();
        book.setAuthor(this.getAuthor());
        book.setName(this.getName());
        book.setId(this.Id);
        return book;
    }

    @Override
    public String toString() {
        return "BookDeep{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", author='" + author + '\'' +
                '}';
    }
}
