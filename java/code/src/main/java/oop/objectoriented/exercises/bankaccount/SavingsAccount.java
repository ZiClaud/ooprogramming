package oop.objectoriented.exercises.bankaccount;

/**
 * A bank account paying interests on deposits
 *
 * @author Nicola Bicocchi
 */
public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void payInterest() {
        balance += balance * interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}