package Account;

abstract class Account {
     double balance;
    int operationCount;

    public Account(double balance, int operationCount) {
        this.balance = balance;
        this.operationCount = operationCount;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public int getOperationCount() {
        return operationCount;
    }
}