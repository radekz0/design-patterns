package designpatterns.creational.prototype;

public class PlasticTree extends Tree{
    @Override
    public Tree copy() {
        PlasticTree plasticTree = new PlasticTree();
        return plasticTree;
    }
}
