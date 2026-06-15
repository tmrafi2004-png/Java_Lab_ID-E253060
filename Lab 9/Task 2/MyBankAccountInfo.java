class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    
    public void setAccountHolder(String name) {
        accountHolder = name;
    }
    public void setAccountNumber(String number) {
        accountNumber = number;
    }
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        }
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + maskAccountNumber(accountNumber));
        System.out.println("Balance: " + balance);
    }
    private String maskAccountNumber(String number) {
        if (number.length() <= 4) {
            return number;
        }
        return "****" + number.substring(number.length() - 4);
    }
}
public class MyBankAccountInfo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("Taki Mahmud Rafi");
        account.setAccountNumber("1234567890");
        account.setBalance(5000);
        account.showAccountInfo();
    }
}