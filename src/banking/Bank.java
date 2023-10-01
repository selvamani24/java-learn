package banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final String BRANCH_NAME = "Mariyamman indian bank";
    private static final Integer BRANCH_CODE = 1324;
    private static final List<Account>  ACCOUNT_LIST = new ArrayList<>();

    private Bank() {}

    public static void createAccount(Account account) {
        ACCOUNT_LIST.add(account);
    }

    public static void withdrawAmount(Integer accountNo, Integer amount) {
        int size = 0;
        for (Account account: ACCOUNT_LIST) {
            size++;
            if (account.getNumber().equals(accountNo)) {
                System.out.println(PaymentServicesUtils.withdraw(account, amount));
                break;
            }
            if (size == ACCOUNT_LIST.size()) {
                System.out.println("Account not found");
            }
        }
    }

    public static void displayBalance(Integer accountNo) {
        int size = 0;
        for (Account account: ACCOUNT_LIST) {
            size++;
            if (account.getNumber().equals(accountNo)) {
                System.out.println("Curr Bal: " + account.getBalance());
                break;
            }
            if (size == ACCOUNT_LIST.size()) {
                System.out.println("Account not found");
            }
        }
    }

    public static void deposit(Integer accountNo, Integer amount) {
        int size = 0;
        for (Account account: ACCOUNT_LIST) {
            size++;
            if (account.getNumber().equals(accountNo)) {
                System.out.println(PaymentServicesUtils.deposit(account, amount));
                break;
            }
            if (size == ACCOUNT_LIST.size()) {
                System.out.println("Account not found");
            }
        }
    }

    public static void displayAccounts() {
        for (Account account: ACCOUNT_LIST) {
            System.out.println(account.getHolder());
        }
    }

    public static List<Account> getAccountList() {
        return Bank.ACCOUNT_LIST;
    }

}
