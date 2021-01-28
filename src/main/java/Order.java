public class Order {

    private Drink drink;
    private int sugar;

    Order(Drink drink, int sugar) {
        this.drink = drink;
        this.sugar = sugar;
    }

    Drink getBeverage() {
        return drink;
    }

    void setBeverage(Drink drink) {
        this.drink = drink;
    }

    int getSugar() {
        return sugar;
    }

    void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
