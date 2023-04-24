package org.example.abstractFactory;

public class Main {
    public static void main(String[] args) {

        //abstract factory method

        AnimalFactory animalFactory = new AnimalFactory();

        MammalFactory mammal = animalFactory.createMammal();
        mammal.createCat().speak();

        ReptileFactory reptile = animalFactory.createReptile();
        reptile.createSnake().makeSound();
    }
}
