package designpatterns.creational.prototype;

public class OakTree extends Tree{

    @Override
    public Tree copy() {
        OakTree oakTree = new OakTree();
        return oakTree;
    }
}
