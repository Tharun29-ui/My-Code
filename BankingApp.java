class Account {
    private int currentBalance = 1000;

    public synchronized void makeWithdrawal(int withdrawalAmount) {
        if (currentBalance >= withdrawalAmount) {
            currentBalance -= withdrawalAmount;
            System.out.println("Withdrawn: " + withdrawalAmount + ", Remaining Balance: " + currentBalance);
        } else {
            System.out.println("Insufficient funds for withdrawal of: " + withdrawalAmount);
        }
    }

    public void makeDeposit(int depositAmount) {
        currentBalance += depositAmount;
        System.out.println("Deposited: " + depositAmount + ", New Balance: " + currentBalance);
    }
}

class DepositTask implements Runnable {
    private Account account;
    private int depositAmount;

    public DepositTask(Account account, int depositAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
    }

    @Override
    public void run() {
        account.makeDeposit(depositAmount);
    }
}

class WithdrawalTask implements Runnable {
    private Account account;
    private int withdrawalAmount;

    public WithdrawalTask(Account account, int withdrawalAmount) {
        this.account = account;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void run() {
        account.makeWithdrawal(withdrawalAmount);
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account myAccount = new Account();

        Runnable depositOperation = new DepositTask(myAccount, 500);
        Runnable withdrawalOperation1 = new WithdrawalTask(myAccount, 700);
        Runnable withdrawalOperation2 = new WithdrawalTask(myAccount, 1500);

        Thread thread1 = new Thread(depositOperation);
        Thread thread2 = new Thread(withdrawalOperation1);
        Thread thread3 = new Thread(withdrawalOperation2);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
