import java.util.ArrayList;

public class BankMain {
    static void main() {
        Account ac1= new Account("Murugan","1231",200);
        Account ac2= new Account("Ramalingam","1232",300);
        Account ac3= new Account("Boopathi Ramalingam","1233",500);

        Bank bank = new Bank();

        bank.addAccount(ac1);
        bank.addAccount(ac2);
        bank.addAccount(ac3);

        ArrayList<Account> accountArrayList = bank.getAccountDetails();

        System.out.println("Before remove the account:");
        for(Account a: accountArrayList){
            System.out.println(a.getName()+"  "+a.getAccountNumber()+"  "+a.getBalance());
        }

        bank.removeAccount(ac3);

        System.out.println("After remove the account:");
        for(Account a: accountArrayList){
            System.out.println(a.getName()+"  "+a.getAccountNumber()+"  "+a.getBalance());
        }

        System.out.println(ac2.getBalance());
        bank.depositMoney(ac2,100);
        System.out.println(ac2.getBalance());
        //Withdraw

        System.out.println(ac1.getBalance());
        bank.moneyWithdraw(ac1,50);
        System.out.println(ac1.getBalance());
    }
}
