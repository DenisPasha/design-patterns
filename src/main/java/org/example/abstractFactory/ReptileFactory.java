package org.example.abstractFactory;

import org.example.abstractFactory.entities.*;

public class ReptileFactory {
    public Reptile createSnake(){
        return new Snake();
    }
    public Reptile createAlligator(){
         return new Alligator();
    }
}
