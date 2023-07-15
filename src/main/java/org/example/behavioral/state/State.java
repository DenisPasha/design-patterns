package org.example.behavioral.state;

public abstract class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String powerButton();
    public abstract String homeButton();
}
