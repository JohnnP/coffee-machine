package coffee;

import static coffee.Drink.*;

public class DrinkMakerProtocol {

    public String format(Order order) {
        return order.getBeverage().getCode() + "::";
    }
}
