package org.example.structural.decorator;

public class Ham extends PizzaDecorator{

    public Ham(Pizza pizza) {
        super(pizza);
    }

    public String bake(){
      return pizza.bake() + addHam();
    }

    private String addHam() {
        return "with Ham ";
    }
}
