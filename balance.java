class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class balance {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000);
        account.deposit(1000);
        account.withdraw(300);
        account.displayBalance();
    }
}
