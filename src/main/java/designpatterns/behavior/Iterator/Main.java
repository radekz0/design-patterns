package designpatterns.behavior.Iterator;

/*
Iterator pattern is used to get a way to access the elements of a Collection is sequential manner without any need to know its underlying representation.

*/

public class Main {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}