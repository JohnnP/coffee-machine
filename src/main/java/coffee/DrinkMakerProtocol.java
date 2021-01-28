package coffee;

import static coffee.Drink.*;

public class DrinkMakerProtocol {

    public String format(Order order) {
        if(CHOCOLATE == order.getBeverage()) {
            return "H::";
        }
        if(TEA == order.getBeverage()) {
            return "T::";
        }
        return "C::";
    }
}
