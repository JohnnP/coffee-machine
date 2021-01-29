package coffee;

public class Order {

    private Drink drink;
    private int sugar;

    Order(Drink drink, int sugar) {
        this.drink = drink;
        this.sugar = sugar;
    }

    String getDrinkCode() {
        return drink.getCode();
    }

    int getSugar() {
        return sugar;
    }
}
