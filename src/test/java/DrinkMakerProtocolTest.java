import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkMakerProtocolTest {

    @Test
    void should_order_coffee_without_sugar() {
        DrinkMakerProtocol drinkMakerProtocol = new DrinkMakerProtocol();
        IncomingOrder incomingOrder = new IncomingOrder(Beverage.COFFEE, 0);

        String formatedOrder = drinkMakerProtocol.transform(incomingOrder);

        assertEquals("C::", formatedOrder);
    }
}
