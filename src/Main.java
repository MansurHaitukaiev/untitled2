public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Margherita", 189.0, "Large");
        Pizza p2 = new Pizza("Pepperoni", 210.0, "Medium");
        Pizza p3 = new Pizza("Capricciosa", 225.5, "Large");
        Pizza p4 = new Pizza("Quattro Formaggi", 240.0, "Large");

        Drink d1 = new Drink("Cola", 45.0, true);
        Drink d2 = new Drink("Tea", 30.0, false);
        Drink d3 = new Drink("Juice", 50.0, true);
        Drink d4 = new Drink("Coffee", 65.0, false);
        Drink d5 = new Drink("Water", 25.0, true);

        double newPrice = p1.applyDiscount(10); // Знижка 10%
        System.out.println("Original price for " + p1.getName() + ": " + p1.getPrice());
        System.out.println("Price after 10% discount: " + newPrice);
        System.out.println("-------------------------");

        Cart<Pizza> pizzaCart = new Cart<>();
        Cart<Drink> drinkCart = new Cart<>();

        pizzaCart.addItem(p1);
        pizzaCart.addItem(p2);
        pizzaCart.addItem(p3);
        pizzaCart.addItem(p4);

        drinkCart.addItem(d1);
        drinkCart.addItem(d2);
        drinkCart.addItem(d3);
        drinkCart.addItem(d4);
        drinkCart.addItem(d5);

        String pizzasText = pizzaCart.printCart(
                item -> item.getInfo()
        );

        String drinksText = drinkCart.printCart(
                drink -> "Drink: " + drink.getInfo()
        );

        System.out.println("=== Pizza cart ===");
        System.out.println(pizzasText);

        System.out.println("\n=== Drink cart ===");
        System.out.println(drinksText);

        System.out.println("\n-------------------------");
        System.out.println("Pizza count = " + pizzaCart.getCount());
        System.out.println("Drink count = " + drinkCart.getCount());
    }
}