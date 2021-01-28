package coffee;

import static coffee.Drink.*;

public class DrinkMakerProtocol {

    public String format(Order order) {
        if(CHOCOLATE == order.getBeverage()) {
            return order.getBeverage().getCode() + "::";
        }
        if(TEA == order.getBeverage()) {
            return order.getBeverage().getCode() + "::";
        }
        return order.getBeverage().getCode() + "::";
    }
}
