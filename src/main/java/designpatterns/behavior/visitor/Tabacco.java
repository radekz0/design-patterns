package designpatterns.behavior.visitor;

public class Tabacco implements Visitable {
    private double price;

    Tabacco(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}