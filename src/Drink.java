public class Drink extends Product implements Discountable {
    private final boolean isCold;

    public Drink(String name, double price, boolean isCold) {
        super(name, price);
        this.isCold = isCold;
    }

    public boolean isCold() { return isCold; }

    @Override
    public String getInfo() {
        String temp = isCold ? "cold" : "hot";
        return String.format("%s [%s] - %.1f UAH", getName(), temp, getPrice());
    }

    @Override
    public double applyDiscount(double percent) {
        return getPrice() - (getPrice() * percent / 100.0);
    }
}