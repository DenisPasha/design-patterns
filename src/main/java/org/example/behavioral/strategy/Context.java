package org.example.behavioral.strategy;

public class Context implements Strategy{

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public int doOperation(int a, int b) {
        return strategy.doOperation(a , b);
    }
}
