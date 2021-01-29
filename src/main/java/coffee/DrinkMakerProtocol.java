package coffee;

public class DrinkMakerProtocol {

    public String format(Order order) {
        return order.getDrinkCode() + (order.getSugar() != 0 ? ":" + order.getSugar() +":0" : "::");
    }

}
