package designpatterns.creational.builder;

/*
When to use:
When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters
When an increase in the number of constructor parameters leads to a large list of constructors
When client expects different representations for the object that's constructed

*/

public class Main {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Radek", "1234")
                .withEmail("radek@gmail.com")
                .wantNewsletter(true)
                .build();
    }
}