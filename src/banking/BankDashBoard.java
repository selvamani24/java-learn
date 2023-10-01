package banking;

import java.util.Scanner;

public class BankDashBoard {
    public static void displayMenu() {
        System.out.println("----INDIAN BANK----");
        System.out.println();
        System.out.println(" BALANCE INQUIRY -----> 1");
        System.out.println(" DEPOSIT         -----> 2");
        System.out.println(" WITHDRAW        -----> 3");
        System.out.println(" SEND MONEY      -----> 4");
        System.out.println();
        System.out.println("-------------------------------");
        selectOption();
    }
    public static void selectOption() {
        while (true) {

            System.out.print("Select Your paymentservices By Name: ");
            Scanner input = new Scanner(System.in);
            Integer choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter your acc number: ");
                int accNo = input.nextInt();
                Bank.displayBalance(accNo);
                break;
            case 2:
                System.out.print("Enter You Acc no: ");
                int accountNo = input.nextInt();
                System.out.print("Enter Your Amount: ");
                int amount = input.nextInt();
                Bank.deposit(accountNo , amount);
                break;
            case 3:
                System.out.print("Enter You Acc no: ");
                int accountNum = input.nextInt();
                System.out.print("Enter Your Amount: ");
                int amt = input.nextInt();
                Bank.withdrawAmount(accountNum , amt);
                break;
            case 4:
                System.out.print("Enter sender Id: ");
                int senderId = input.nextInt();
                System.out.print("Enter receiver Id: ");
                int receiverId = input.nextInt();
                PaymentServicesUtils.sendTo(senderId, receiverId);
                break;
            default:
                System.out.println("Give a Valid Input");
        }
       if(choice==0) {
           break;
       }

        }
    }
}
