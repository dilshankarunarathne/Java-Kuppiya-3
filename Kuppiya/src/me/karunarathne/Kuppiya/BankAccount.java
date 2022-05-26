package me.karunarathne.Kuppiya;

public class BankAccount {
    private String name;
    private int accNo;
    private String branch;
    private int balance;

    public BankAccount(String name, int accNo, String branch) {
        this.name = name;
        this.accNo = accNo;
        this.branch = branch;

        creationMessage();
    }

    public BankAccount(String name, int accNo, String branch, int amountDeposited) {
        this.name = name;
        this.accNo = accNo;
        this.branch = branch;
        this.balance = amountDeposited;

        creationMessage();
    }

    private void creationMessage() {
        System.out.println("Bank account " + accNo + " created for " + name
                + " with initial balance of Rs." + balance);
    }

    public void deposit(int amount) {
        this.balance += amount;

        System.out.println(
                        "Amount of Rs." + amount +
                        " deposited for account number " + this.accNo
        );

        this.checkBalance();
    }

    public void checkBalance() {
        System.out.println(
                "Current balance of Account number: " + this.accNo +
                " is: " + this.balance
        );
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Amount of " + amount + " was withdrawn from the account " + this.accNo);
            this.checkBalance();
        } else {
            System.out.println("Sorry, your balance is insufficient!");
        }
    }
}
