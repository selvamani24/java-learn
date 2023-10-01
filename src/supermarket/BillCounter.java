package supermarket;

@SuppressWarnings("unused")
public class BillCounter {
   public static void checkOut() {
       Printer.printBill(Cart.getAllProducts());
   }
}
