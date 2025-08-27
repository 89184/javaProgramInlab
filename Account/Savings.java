package Account;

public class Savings extends Account {

    public Savings(double balance, int operationCount) {
        super(balance, operationCount);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        operationCount++;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied. Balance cannot go below 100.");
        } else {
            balance -= amount;
            operationCount++;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }
}