
public class JointBankAccount {
    private int balance = 50000;

    // Synchronized method to withdraw money
    public synchronized void withdraw(String accountHolder, int amount) {
        System.out.println(accountHolder + " is attempting to withdraw: " + amount);

        if (amount <= balance) {
            System.out.println(accountHolder + " withdrawal approved.");
            balance -= amount;
            System.out.println(accountHolder + " successfully withdrew " + amount);
        } else {
            System.out.println("Insufficient balance for " + accountHolder);
        }

        System.out.println("Remaining balance: " + balance);
        System.out.println("-----------------------------------");
    }
}


