public class prodNappy extends prodHygiene {

    public prodNappy(String name, float price, int quantity, String unit, int qtyInPack, int size, float minWeight,
            float maxWeight, String type) {
        super(name, price, quantity, unit, qtyInPack);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    private int size;
    private float minWeight;
    private float maxWeight;
    private String type;

    public String toString() {
        return String.format("Name:%s qp:%d %s\tprice:$%.2f\tq:%d%s\t sz:%d\t wt:%.1f %.1f", this.getName(), this.getQtyInPack(), type, this.getPrice(),
                this.getQuantity(), this.getUnit(), size, minWeight, maxWeight);
    }
}
