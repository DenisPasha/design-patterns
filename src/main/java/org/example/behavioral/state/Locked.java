package org.example.behavioral.state;

public class Locked extends State{
    public Locked(Phone phone) {
        super(phone);
    }

    @Override
    public String powerButton() {
        phone.setState(new Off(phone));
        return "Phone is in Off state";
    }

    @Override
    public String homeButton() {
        phone.setState(new Ready(phone));
        return "Phone is in Ready state";
    }
}
