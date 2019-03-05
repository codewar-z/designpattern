import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.Services;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("HotelKeeper example")
class HotelKeeperTest {

    @Test
    void TestRequestService() {
        HotelKeeper hotelKeeper = new HotelKeeper();
        double price = hotelKeeper.requestService(Services.Lunch);
        assertEquals(10.0, price);
    }

    @Test
    void TestCheckoutWithSingleService() {
        HotelKeeper hotelKeeper = new HotelKeeper();
        hotelKeeper.requestService(Services.Lunch);
        String receipt = hotelKeeper.checkOut();
        assertEquals("Total Amount: 10.0", receipt);
    }

    @Test
    void TestCheckoutWithMultipleServices() {
        HotelKeeper hotelKeeper = new HotelKeeper();
        hotelKeeper.requestService(Services.Lunch);
        hotelKeeper.requestService(Services.RoomCleaning);
        hotelKeeper.requestService(Services.Dinner);
        String receipt = hotelKeeper.checkOut();
        assertEquals("Total Amount: 30.0", receipt);
    }
}
