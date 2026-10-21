public class BankAccountMain {
    static void main() {
        BankAccount ba= new BankAccount(1,"Murugan Ramalingam",10000);
        SavingsAccount savingsAccount= new SavingsAccount(1,"Murugan Ramalingam",10000, 60);
        System.out.println("Before:"+ba.getBalance());
        //savingsAccount.applyInterest();
        System.out.println(ba.depositMoney(2000));
        System.out.println("after:"+ba.getBalance());
        savingsAccount.applyInterest();
        System.out.println("after:"+ba.getBalance());
        }
}
