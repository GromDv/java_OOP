public class prodHygiene extends productBase {
    public prodHygiene(String name, float price, int quantity, String unit, int qtyInPack) {
        super(name, price, quantity, unit);
        this.qtyInPack = qtyInPack;
    }

    private int qtyInPack;

    public int getQtyInPack() {
        return qtyInPack;
    }

    public void setQtyInPack(int qtyInPack) {
        this.qtyInPack = qtyInPack;
    }

    public String toString() {
        return String.format("Name:%s %d\tprice:$%.2f\tq:%d%s", this.getName(), qtyInPack, this.getPrice(), this.getQuantity(), this.getUnit());
    }
}
