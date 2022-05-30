package me.karunarathne.Kuppiya;

public class Main {
    public static void main(String[] args) {

        BankAccount dilshanAccount ;

        dilshanAccount = new KidsAccount("Dilshan Karunarathne", "NW");

        dilshanAccount.checkBalance();

        BankAccount donaldAccount = new BankAccount(
                "Donald Trump", "NY", 1000000
        );
        donaldAccount.checkBalance();

        dilshanAccount.deposit(5000);
        dilshanAccount.checkBalance();

        dilshanAccount.withdraw(8000);
        dilshanAccount.checkBalance();

        System.out.println("\n\n\t" + dilshanAccount + "\n\t" + donaldAccount);

    }

}
