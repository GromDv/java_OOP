public class prodEgg extends dateDepend {

    public prodEgg(String name, float price, int quantity, String unit, int ExpirationDays, int qtyInPack) {
        super(name, price, quantity, unit, ExpirationDays);
        this.qtyInPack = qtyInPack;
    }

    private int qtyInPack;

    public String toString() {
        return String.format("Name:%s %dp/p\tprice:$%.2f\tq:%d%s\texp:%d", this.getName(), qtyInPack, this.getPrice(),
                this.getQuantity(), this.getUnit(),
                this.getExpirationDays());
    }
}
