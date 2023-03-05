public class prodMilk extends dateDepend {

    public prodMilk(String name, float price, int quantity, String unit, int ExpirationDays, float fatCont) {
        super(name, price, quantity, unit, ExpirationDays);
        this.fatCont = fatCont;
    }

    private float fatCont;

    public String toString() {
        return String.format("Name:%s %.1f%%\tprice:$%.2f\tq:%d%s exp:%d", this.getName(), fatCont, this.getPrice(),
                this.getQuantity(), this.getUnit(), this.getExpirationDays());
    }
}
