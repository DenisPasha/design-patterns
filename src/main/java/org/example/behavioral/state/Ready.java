package org.example.behavioral.state;

public class Ready extends State{
    public Ready(Phone phone) {
        super(phone);
    }

    @Override
    public String powerButton() {
        phone.setState(new Off(phone));
        return "Phone is in off state";
    }

    @Override
    public String homeButton() {
        phone.setState(new Locked(phone));
        return "Phone is in Locked state";
    }
}
