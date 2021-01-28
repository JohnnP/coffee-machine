import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkMakerProtocolTest {

    @Test
    void should_order_coffee_without_sugar() {
        DrinkMakerProtocol drinkMakerProtocol = new DrinkMakerProtocol();
        Order order = new Order(Drink.COFFEE, 0);

        String formattedOrder = drinkMakerProtocol.format(order);

        assertEquals("C::", formattedOrder);
    }
}
