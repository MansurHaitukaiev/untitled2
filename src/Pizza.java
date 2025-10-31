public class Pizza extends Product implements Discountable {
    private final String size; // Small, Medium, Large

    public Pizza(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() { return size; }

    @Override
    public String getInfo() {
        return String.format("Pizza %s (%s) - %.1f UAH", getName(), getSize(), getPrice());
    }

    @Override
    public double applyDiscount(double percent) {
        return getPrice() - (getPrice() * percent / 100.0);
    }
}