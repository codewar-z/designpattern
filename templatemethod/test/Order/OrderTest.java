package Order;

import org.junit.jupiter.api.Test;

public class OrderTest {
    @Test
    void shouldBuildWebOrder() {
        OrderTemplate netOrder = new WebOrder();
        netOrder.processOrder(true);
    }

    @Test
    void shouldBuildStoreOrder() {
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
