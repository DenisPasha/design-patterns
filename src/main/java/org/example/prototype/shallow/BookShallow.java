package org.example.prototype.shallow;

public class BookShallow implements Cloneable{
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
