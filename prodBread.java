public class prodBread extends dateDepend {

    public prodBread(String name, float price, int quantity, String unit, int ExpirationDays, String mealType) {
        super(name, price, quantity, unit, ExpirationDays);
        this.mealType = mealType;
    }

    private String mealType;

    public String toString() {
        return String.format("Name:%s %s\tprice:$%.2f\tq:%d%s exp:%d", this.getName(), mealType, this.getPrice(),
                this.getQuantity(), this.getUnit(), this.getExpirationDays());
    }
}
