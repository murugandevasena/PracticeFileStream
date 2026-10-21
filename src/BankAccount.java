import java.util.ArrayList;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    private ArrayList<BankAccount> bankAccounts;

    public BankAccount(long accountNumber, String accountHolderName, long balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String depositMoney(double amount){
    balance=balance+amount;
    return "Total amount:"+balance+" Deposited amount: "+amount;
    }

    public String withdrawMoney(double wAmount){
        if (balance >= 1000 && balance>wAmount){
            balance=balance-wAmount;
            return "Amount wihdrawed:"+balance;
        } else {
            return "You done have suufficent amount in your account";
        }
    }
}
