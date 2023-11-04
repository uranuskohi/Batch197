package day22_revision_oop;

public class AccountRunner {
    public static void main(String[] args) {

        Account savingsAccount = new SavingAccount(1000);
        Account checkingAccount = new CheckingAccount(1000);
        // When we need a variable whose data type is an interface, we should
        // use constructor of its child class
        savingsAccount.deposit(350);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(2000);
        System.out.println("savingsAccount.getBalance() = " + savingsAccount.getBalance());

        checkingAccount.deposit(300);
        checkingAccount.withdraw(500);
        System.out.println("checkingAccount.getBalance() = " + checkingAccount.getBalance());
    }
}
