package designpatterns.behavior.visitor;

/*
The purpose of a Visitor pattern is to define a new operation without introducing the modifications to an existing object structure.
It allows you to add methods to classes where the method implementation is different depending on the class.
*/

public class Main {

    public static void main(String[] args) {
        Visitor taxVisitor = new TaxVisitor();
        Tabacco tabacco = new Tabacco(3.5);
        Double priceAfterTax = tabacco.accept(taxVisitor);
        System.out.println(priceAfterTax);
    }

}
