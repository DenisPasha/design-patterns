package org.example.behavioral.strategy;

public class Main {
    public static void main(String[] args) {

        // strategy choosing
        Context contextAdd = new Context(new Add());
        int resultOfAdding  = contextAdd.doOperation(23, 3);

        Context contextSub = new Context(new Subtract());
        int resultOfSubtraction = contextSub.doOperation(3, 2);


    }
}
