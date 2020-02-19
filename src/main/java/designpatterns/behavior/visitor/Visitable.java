package designpatterns.behavior.visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
