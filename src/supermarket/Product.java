package supermarket;

@SuppressWarnings("unused")
public class Product {
    public final String particular;
    private Integer rate;
    private Integer quantity;
    public Product(String particular,Integer rate,Integer quantity) {
        this.particular = particular;
        this.rate=rate;
        this.quantity=quantity;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getParticular() {
        return particular;
    }

    public Integer getRate() {
        return rate;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
