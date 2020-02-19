package designpatterns.behavior.visitor;

public interface Visitor {
    double visit(Liquor liquorItem);
    double visit(Tabacco tabaccoItem);
}
