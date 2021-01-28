package coffee;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static coffee.Drink.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DrinkMakerProtocolTest {

    private DrinkMakerProtocol drinkMakerProtocol;
    private String formattedOrder;

    @BeforeAll
    void setup() {
         drinkMakerProtocol = new DrinkMakerProtocol();
    }

    @Test
    void should_order_coffee_without_sugar() {
        when_order(COFFEE, without_sugar());
        formatter_should_return("C::");
    }

    @Test
    void should_order_tea_without_sugar() {
       when_order(TEA, without_sugar());
       formatter_should_return("T::");
    }

    @Test
    void should_order_chocolate_without_sugar() {
        when_order(CHOCOLATE, without_sugar());
        formatter_should_return("C::");
    }

    void when_order(Drink drink, int i) {
        Order order = new Order(drink, 0);
        formattedOrder = drinkMakerProtocol.format(order);
    }

    void formatter_should_return(String expectedString) {
        assertEquals(expectedString, formattedOrder);
    }

    private int without_sugar() {
        return 0;
    }
}
