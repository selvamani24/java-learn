package supermarket;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Cart {
    private static final List<Product> PRODUCT_LIST = new ArrayList<>();

    public static List<Product> getAllProducts() {
        return PRODUCT_LIST;
    }

    public static void addToCart(Product product) {
        PRODUCT_LIST.add(product);
    }
}
