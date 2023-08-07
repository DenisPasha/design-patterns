package org.example.behavioral.visitor;

import org.example.behavioral.visitor.impl.Cigars;
import org.example.behavioral.visitor.impl.Milk;
import org.example.behavioral.visitor.impl.Whisky;

public class Main {
    public static void main(String[] args) {

        TaxVisitor taxVisitor = new TaxVisitor();
        Necessity milk = new Milk(1.90);
        double milkSumAfterTax = taxVisitor.visit(milk);

        Liquor whiskey = new Whisky(21.99);
        double whiskeySumAfterTax = taxVisitor.visit(whiskey);

        Tobacco cigars = new Cigars(10.99);
        double cigarsSumAfterTax = taxVisitor.visit(cigars);


    }
}
