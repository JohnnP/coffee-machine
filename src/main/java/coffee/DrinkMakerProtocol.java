package coffee;

public class DrinkMakerProtocol {

    public static final int WITHOUT_SUGAR = 0;

    public String format(Order order) {
        return getDrinkCode(order) + manageSugar(order);
    }

    private String getDrinkCode(Order order) {
        return order.getDrinkCode();
    }

    private String manageSugar(Order order) {
        if (WITHOUT_SUGAR == order.getSugar()) {
            return "::";
        }
        return ":" + order.getSugar() + ":0";
    }

}
