interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}
class DBBL implements ATMService {
    private double balance = 10000.0;

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        DBBL atm = new DBBL();
        atm.checkBalance();
        atm.deposit(2000);
        atm.withdraw(3000);
        atm.checkBalance();
    }
}