package me.karunarathne.Kuppiya;

public class KidsAccount extends BankAccount {
    static double interest = 1.02 ;

    public KidsAccount (String name, String branch) {
        super (name, branch) ;
        System.out.println(name + " created a kids' account!");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Kids accounts get 2% bonus...!");

        super.deposit((int) (amount * interest));
    }

    @Override
    public void checkBalance () {
        System.out.println(
                "Current balance of Kids Account : " + super.getAccNo() +
                        " is: " + this.getBalance()
        );
    }

    @Override
    public String toString() {
        return "This is a Kids account (" + "accountNo:" + getAccNo() + ")";
    }
}
