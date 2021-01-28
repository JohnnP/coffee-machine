import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkMakerProtocolTest {

    @Test
    void test() {
        DrinkMakerProtocol drinkMakerProtocol = new DrinkMakerProtocol();
        String formatedOrder = drinkMakerProtocol.transform(null);

        assert(formatedOrder).equals("");
    }
}
