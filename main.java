
public class Main {
     public static void main(String[] args) {
        JointBankAccount account = new JointBankAccount();

        AccountHolder userA = new AccountHolder(account, "User A", 45000);
        AccountHolder userB = new AccountHolder(account, "User B", 20000);

        userA.start();
        userB.start();
    }
}

