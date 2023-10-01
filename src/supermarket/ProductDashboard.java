package supermarket;

import java.util.Scanner;

@SuppressWarnings("all")
public class ProductDashboard {
    private ProductDashboard(){}
    public static void start() {
        showAllProducts();
    }
    private static void showAllProducts() {

        System.out.println("         SELVAMANI.COM        ");
        System.out.println("------------------------------");
        System.out.println("ID               PRODUCT-NAME");
        System.out.println("1                   SOAP");
        System.out.println("2                   SHAMPOO");
        System.out.println("3                   BOOK");
        System.out.println("4                   PEN");
        System.out.println("------------------------------");
        selectProduct();
    }

    private static void selectProduct() {

        while (true) {

            System.out.print("Select Your Product By Name: ");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            int quantity = 0;

            switch (choice.toUpperCase()) {
                case "SOAP":
                    System.out.print("Quantity: ");
                    quantity = input.nextInt();
                    Cart.addToCart(new Product("Soap", 30, quantity));
                    break;

                case "SHAMPOO":
                    System.out.print("Quantity: ");
                    quantity = input.nextInt();
                    Cart.addToCart(new Product("Shampoo", 5, quantity));
                    break;

                case "BOOK":
                    System.out.print("Quantity: ");
                    quantity = input.nextInt();
                    Cart.addToCart(new Product("Book", 45, quantity));
                    break;

                case "PEN":
                    System.out.print("Quantity: ");
                    quantity = input.nextInt();
                    Cart.addToCart(new Product("Pen", 25, quantity));
                    break;

                case "OK":
                    BillCounter.checkOut();
                    break;
                default:
                    System.out.println("Item Not Found");
            }

            if (choice.toUpperCase().equals("OK")) break;
        }
    }
}
