class BankAccount {
    String accNo;
    String accHold;
    double bal;
    String accType;

    public BankAccount(String accNo, String accHold) {
        this.accNo = accNo;
        this.accHold = accHold;
        this.bal = 0.0;
        this.accType = "Savings";
    }

    public BankAccount(String accNo, String accHold, double bal) {
        this.accNo = accNo;
        this.accHold = accHold;
        this.bal = bal;
        this.accType = "Savings";
    }

    public BankAccount(String accNo, String accHold, double bal, String accType) {
        this.accNo = accNo;
        this.accHold = accHold;
        this.bal = bal;
        this.accType = accType;
    }

    public void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + accHold);
        System.out.println("Balance: " + bal);
        System.out.println("Account Type: " + accType);
        System.out.println("----------------------------------------");
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "John Doe");
        account1.display();

        BankAccount account2 = new BankAccount("789101", "Jane Smith", 500.0);
        account2.display();

        BankAccount account3 = new BankAccount("112233", "Mary Johnson", 1000.0, "Checking");
        account3.display();
    }
}
