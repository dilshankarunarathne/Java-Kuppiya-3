package me.karunarathne.Kuppiya;

public class Main {
    public static void main(String[] args) {

        BankAccount dilshanAccount = new BankAccount(
                "Dilshan K", 6415, "NW");

        BankAccount donaldAccount = new BankAccount(
                "Donald Trump", 6456, "NY", 1000000
        );

        dilshanAccount.deposit(5000);

        donaldAccount.checkBalance();

        dilshanAccount.withdraw(8000);

        dilshanAccount.checkBalance();



    }
}
