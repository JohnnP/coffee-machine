package coffee;

public class DrinkMakerProtocol {

    public String format(Order order) {
        return order.getDrinkCode() + (order.getSugar() == 1 ? ":1:0" : "::");
    }

}
