import java.util.ArrayList;

public class Bank {

    public ArrayList<Account> accountDetails;

    public Bank(){
        this.accountDetails= new ArrayList<Account>();
    }

    public void addAccount(Account account){
        accountDetails.add(account);
    }

    public void removeAccount(Account account){
        accountDetails.remove(account);
    }

    public void depositMoney(Account account,double amount){
        account.moneyDeposit(amount);
    }

    public void moneyWithdraw(Account account, double amount){
        account.withdrawMoney(amount);
    }

    public ArrayList<Account> getAccountDetails(){
        return accountDetails;
    }
}
