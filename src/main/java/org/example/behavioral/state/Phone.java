package org.example.behavioral.state;

public class Phone {
    protected State state;

    public Phone() {
        this.state = new Off(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
