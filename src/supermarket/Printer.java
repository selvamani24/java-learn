package supermarket;

import java.util.List;

@SuppressWarnings("unused")
public class Printer {
    private Printer() {
    }

    private static void toPrintBill(List<Product> productList) {
        int totalValue = 0;

        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Particular          Rate     Qty     Amount");
        System.out.println("-------------------------------------------");

        for (Product product : productList) {
            System.out.printf("%-15s     %3d      %3d      %2d\n", product.getParticular(), product.getRate(),
                    product.getQuantity(), product.getRate() * product.getQuantity());
            totalValue += product.getRate() * product.getQuantity();
        }

        System.out.println("-------------------------------------------");
        System.out.printf("TOTAL PRICE:                         %-2d\n", totalValue);
        System.out.println("-------------------------------------------");
        System.out.println("***********      THANK YOU      ***********");
        System.out.println();

    }

    public static void printBill(List<Product> product) {
        toPrintBill(product);
    }
}
