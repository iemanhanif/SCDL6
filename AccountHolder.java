
public class AccountHolder extends Thread  {
    private JointBankAccount account;
    private String name;
    private int amountToWithdraw;

    public AccountHolder(JointBankAccount account, String name, int amountToWithdraw) {
        this.account = account;
        this.name = name;
        this.amountToWithdraw = amountToWithdraw;
    }

    @Override
    public void run() {
        account.withdraw(name, amountToWithdraw);
    }
}

