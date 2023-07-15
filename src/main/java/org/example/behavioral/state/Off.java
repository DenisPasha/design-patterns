package org.example.behavioral.state;

public class Off extends State{
    public Off(Phone phone) {
        super(phone);
    }

    @Override
    public String powerButton() {
        phone.setState(new Locked(phone));
        return "Phone is on Locked state";
    }

    @Override
    public String homeButton() {
        phone.setState(new Locked(phone));
        return "Phone is in Locked state";
    }
}
