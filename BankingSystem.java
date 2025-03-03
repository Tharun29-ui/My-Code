class AxisBank {
    String bankName;
    String branchCode;

    public AxisBank(String bankName, String branchCode) {
        this.bankName = bankName;
        this.branchCode = branchCode;
    }

    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch Code: " + branchCode);
    }
}

class Account extends AxisBank {
    String accountNumber;
    double balance;
    double interestRate;

    public Account(String bankName, String branchCode, String accountNumber, double interestRate) {
        super(bankName, branchCode);
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class SavingsAccount extends Account {
    int transactionLimit;

    public SavingsAccount(String bankName, String branchCode, String accountNumber, double interestRate, int transactionLimit) {
        super(bankName, branchCode, accountNumber, interestRate);
        this.transactionLimit = transactionLimit;
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(String bankName, String branchCode, String accountNumber, double interestRate, double overdraftLimit) {
        super(bankName, branchCode, accountNumber, interestRate);
        this.overdraftLimit = overdraftLimit;
    }
}

class LoanAccount extends AxisBank {
    double loanAmount;
    double interestRate;
    
    public LoanAccount(String bankName, String branchCode, double loanAmount, double interestRate) {
        super(bankName, branchCode);
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public void approveLoan() {
        System.out.println("Loan of amount " + loanAmount + " approved with interest rate " + interestRate + "%.");
    }

    public void calculateEMI(int months) {
        double emi = (loanAmount * interestRate / 100) / months;
        System.out.println("EMI for " + months + " months: " + emi);
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            loanAmount -= amount;
            System.out.println("Payment made: " + amount + ", Remaining Loan Amount: " + loanAmount);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("=== Savings Account ===");
        SavingsAccount savings = new SavingsAccount("Axis Bank", "BR123", "SA12345", 3.5, 10);
        savings.deposit(1000);
        savings.withdraw(200);

        System.out.println("\n=== Current Account ===");
        CurrentAccount current = new CurrentAccount("Axis Bank", "BR123", "CA12345", 2.5, 5000);
        current.deposit(2000);
        current.withdraw(2500);

        System.out.println("\n=== Loan Account ===");
        LoanAccount loan = new LoanAccount("Axis Bank", "BR123", 50000, 5.0);
        loan.approveLoan();
        loan.calculateEMI(12);
        loan.makePayment(5000);
    }
}
