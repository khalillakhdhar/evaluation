package evaluation.ex2;


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(200);
        account.deposit(300);
        System.out.println("Balance finale: " + account.getBalance());
    }
}