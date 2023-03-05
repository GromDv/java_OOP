public class prodChild extends productBase {

    public prodChild(String name, float price, int quantity, String unit, int minAge, int hypoAlergic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.hypoAlergic = hypoAlergic;
    }

    private int minAge;
    private int hypoAlergic;

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getHypoAlergic() {
        return hypoAlergic;
    }

    public void setHypoAlergic(int hypoAlergic) {
        this.hypoAlergic = hypoAlergic;
    }

    public String toString() {
        return String.format("Name:%s %d, %d\t\tprice:$%.2f\tq:%d%s", this.getName(), minAge, hypoAlergic, this.getPrice(),
                this.getQuantity(), this.getUnit());
    }
}
