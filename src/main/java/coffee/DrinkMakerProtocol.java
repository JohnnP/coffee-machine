package coffee;

public class DrinkMakerProtocol {

    public String format(Order order) {
        return order.getDrinkCode() + "::";
    }

}
