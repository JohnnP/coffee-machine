package coffee;

public class DrinkMakerProtocol {

    public String format(Order order) {
        if(Drink.TEA == order.getBeverage()) {
            return "T::";
        }
        return "C::";
    }
}
