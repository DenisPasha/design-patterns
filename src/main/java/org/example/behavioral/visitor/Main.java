package org.example.behavioral.visitor;


import org.example.behavioral.visitor.dto.Liquor;
import org.example.behavioral.visitor.dto.Necessity;
import org.example.behavioral.visitor.dto.Tobacco;

public class Main {
    public static void main(String[] args) {
        Visitor taxVisitor = new TaxVisitor();

        Liquor whiskey = new Liquor(19.99);
        Necessity milk = new Necessity(1.99);
        Tobacco cigars = new Tobacco(15.99);

        double whiskeyAfterTax = whiskey.accept(taxVisitor);
        double milkAfterTax = milk.accept(taxVisitor);
        double cigarsAfterTax = cigars.accept(taxVisitor);
        

    }
}
