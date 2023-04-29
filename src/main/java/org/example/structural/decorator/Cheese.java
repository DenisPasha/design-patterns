package org.example.structural.decorator;

public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake(){
        return pizza.bake() + addCheese();
    }

    private String addCheese() {
        return "with cheese ";
    }


}
