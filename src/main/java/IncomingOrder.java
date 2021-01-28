public class IncomingOrder {

    private Beverage beverage;
    private int sugar;

    IncomingOrder(Beverage beverage, int sugar) {
        this.beverage = beverage;
        this.sugar = sugar;
    }

    Beverage getBeverage() {
        return beverage;
    }

    void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    int getSugar() {
        return sugar;
    }

    void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
