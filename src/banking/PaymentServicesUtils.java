package banking;

import java.util.Scanner;

public class PaymentServicesUtils {
    private PaymentServicesUtils() {}
    public static Integer checkBalance(Account account) {
        return account.getBalance();
    }

    public static String withdraw(Account account, Integer amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            return "Payment Success";
        }
        return "Insufficient Balance";
    }

    public static String deposit(Account account, Integer amount) {
        if (amount != 0) {
            account.setBalance(account.getBalance() + amount);
            return "Deposit successful";
        }
        return "Give a valid amount";
    }
    public static void sendTo(Integer from, Integer to){

        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter your Amount: ");
        int getAmount = getInput.nextInt();

        for (Account account: Bank.getAccountList()) {
             if (account.getNumber().equals(from)) {
                 withdraw(account, getAmount);
                 System.out.println("Payment Successful");
             }
             if (account.getNumber().equals(to)) {
                 deposit(account, getAmount);
                 System.out.println("Payment Successful");
             }
         }
    }

}
