package banking;

public class Main {
    public static void main(String[] args) {
        Bank.createAccount(new Account(321, "selvamani", 2000));
        Bank.createAccount(new Account(123, "jagadeesh", 2000));

       BankDashBoard.displayMenu();

    }
}
