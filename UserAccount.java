public class UserAccount {

    private String userId;
    private String pin;
    private double balance;

    public UserAccount(String userId, String pin, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean login(String id, String pin) {
        return this.userId.equals(id) && this.pin.equals(pin);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
    

