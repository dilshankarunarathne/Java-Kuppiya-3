package me.karunarathne.Kuppiya;

public class BankAccount {
    static int count ;

    private String name;
    private int accNo;
    private String branch;
    private double balance;

    static {
        count = 1001 ;
    }

    public BankAccount(String name, int accNo, String branch) {
        this.name = name;
        this.accNo = accNo;
        this.branch = branch;

        count ++ ;

        System.out.println("An account created for " + name + " with AccNo: " + accNo);
    }

    public double getBalance () {
        return balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public BankAccount(String name, String branch) {
        this (name, count, branch);
    }

    public BankAccount(String name, String branch, int amountDeposited) {
        this (name, branch);

        this.balance = amountDeposited;
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
        } else {
            System.out.println("Sorry, your balance is insufficient!");
        }
    }

    @Override
    public String toString() {
        return "This is a bank account (" + "accountNo:" + getAccNo() + ")";
    }
}
