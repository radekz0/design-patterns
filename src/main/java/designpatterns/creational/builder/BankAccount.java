package designpatterns.creational.builder;

public class BankAccount {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    private BankAccount(String name, String accountNumber, String email, boolean newletter) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.newsletter = newletter;
    }

    public static class BankAccountBuilder{
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber){
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsletter(boolean newsletter){
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(name, accountNumber, email, newsletter);
        }
    }
}
