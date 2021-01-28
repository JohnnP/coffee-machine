package coffee;

import org.junit.jupiter.api.Test;

import static coffee.Drink.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DrinkMakerProtocolTest {

    @Test
    void should_order_coffee_without_sugar() {
        DrinkMakerProtocol drinkMakerProtocol = new DrinkMakerProtocol();
        Order order = new Order(COFFEE, 0);

        String formattedOrder = drinkMakerProtocol.format(order);

        assertEquals("C::", formattedOrder);
    }

    @Test
    void should_order_tea_without_sugar() {
        DrinkMakerProtocol drinkMakerProtocol = new DrinkMakerProtocol();
        Order order = new Order(TEA, 0);

        String formattedOrder = drinkMakerProtocol.format(order);

        assertEquals("T::", formattedOrder);
    }
}
