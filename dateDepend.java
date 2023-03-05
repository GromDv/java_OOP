public class dateDepend extends productBase {
    public dateDepend(String name, float price, int quantity, String unit, int ExpirationDays) {
        super(name, price, quantity, unit);
        this.ExpirationDays = ExpirationDays;
    }

    private int ExpirationDays;

    public int getExpirationDays() {
        return ExpirationDays;
    }

    public void setExpirationDays(int expirationDays) {
        ExpirationDays = expirationDays;
    }

    public String toString() {
        return String.format("Name:%s price:$%.2f, q:%d%s;",this.getName(), this.getPrice(), this.getQuantity(), this.getUnit(), ExpirationDays);
    }
}
