public class SavingsAccount extends BankAccount {

    private double interstRate;

    public SavingsAccount(long accountNumber, String accountHolderName, long balance, double interstRate) {
        super(accountNumber, accountHolderName, balance);
        this.interstRate = interstRate;
    }

    public BankAccount bankAccount;
    public void applyInterest(){
        double intrestAmount= getBalance()*interstRate/100;
        depositMoney(intrestAmount);
    }

}
