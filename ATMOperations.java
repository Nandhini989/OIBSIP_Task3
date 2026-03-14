import java.util.ArrayList;

public class ATMOperations {

    private UserAccount user;
    private ArrayList<String> history = new ArrayList<>();

    public ATMOperations(UserAccount user) {
        this.user = user;
    }

    public void deposit(double amount) {

        user.setBalance(user.getBalance() + amount);
        history.add("Deposited: " + amount);

        System.out.println("Deposit Successful");
        System.out.println("Current Balance: " + user.getBalance());
    }

    public void withdraw(double amount) {

        if(amount <= user.getBalance()) {

            user.setBalance(user.getBalance() - amount);
            history.add("Withdrawn: " + amount);

            System.out.println("Withdrawal Successful");
            System.out.println("Current Balance: " + user.getBalance());

        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void transfer(String receiver, double amount) {

        if(amount <= user.getBalance()) {

            user.setBalance(user.getBalance() - amount);
            history.add("Transferred " + amount + " to " + receiver);

            System.out.println("Transfer Successful");
            System.out.println("Current Balance: " + user.getBalance());

        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void showHistory() {

        if(history.isEmpty()) {
            System.out.println("No transactions yet.");
        }
        else {
            System.out.println("Transaction History:");
            for(String h : history) {
                System.out.println(h);
            }
        }
    }
}
    

