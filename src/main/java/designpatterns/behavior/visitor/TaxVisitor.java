package designpatterns.behavior.visitor;

public class TaxVisitor implements Visitor {
    @Override
    public double visit(Liquor liquorItem) {
        return liquorItem.getPrice() + 0.18 * liquorItem.getPrice();
    }

    @Override
    public double visit(Tabacco tabaccoItem) {
        return tabaccoItem.getPrice() + 0.32 * tabaccoItem.getPrice();
    }
}