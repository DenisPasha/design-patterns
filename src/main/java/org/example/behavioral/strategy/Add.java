package org.example.behavioral.strategy;

public class Add implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
