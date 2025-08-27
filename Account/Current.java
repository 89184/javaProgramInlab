package Account;

public class Current extends Account {

    public Current(double balance, int operationCount) {
        super(balance, operationCount);
    }

    @Override
    public void deposit(double amount) {
        if (operationCount < 2) {
            System.out.println("Deposit denied. Minimum 2 operations required before deposit.");
        } else {
            balance += amount;
            operationCount++;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Withdrawal denied. Insufficient funds.");
        } else {
            balance -= amount;
            operationCount++;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }

    public static void main(String[] args) {
        
        Savings savings = new Savings(500.09,1);
        savings.withdraw(450);
        savings.withdraw(300); 
        System.out.println("Savings Balance: " + savings.getBalance());

        Current current = new Current(1000, 1);
        current.deposit(500); 
        current.withdraw(200); 
        current.withdraw(100); 
        current.deposit(500); 
        System.out.println("Current Balance: " + current.getBalance());
        System.out.println("Current Operations: " + current.getOperationCount());
    }
}
