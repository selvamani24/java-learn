package banking;

public class Account {
    private final Integer number;
    private final String holder;
    private static final String IFSC = "SBIN37160";
    private Integer balance;

    public Account(Integer number, String holder, Integer balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public String getIfsc() {
        return Account.IFSC;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
