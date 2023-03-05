public class prodToiletPaper extends prodHygiene {

    public prodToiletPaper(String name, float price, int quantity, String unit, int qtyInPack, int qtyLayers) {
        super(name, price, quantity, unit, qtyInPack);
        this.qtyLayers = qtyLayers;
    }

    private int qtyLayers;

    public String toString() {
        return String.format("Name:%s %d %dlrs\tprice:$%.2f\tq:%d%s\t", this.getName(), this.getQtyInPack(),
                qtyLayers, this.getPrice(), this.getQuantity(), this.getUnit());
    }
}
