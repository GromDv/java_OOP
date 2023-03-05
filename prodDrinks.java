public class prodDrinks extends productBase {

    private float volume;

    public prodDrinks(String name, float price, int quantity, String unit, Float volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }
    public String toString() {
        return String.format("Name:%s %.1fl\tprice:$%.2f\tq:%d%s",this.getName(), volume, this.getPrice(), this.getQuantity(), this.getUnit());
    }
}
