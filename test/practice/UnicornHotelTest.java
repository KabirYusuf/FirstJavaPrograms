package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UnicornHotelTest {
    UnicornHotel unicornHotel;

    @BeforeEach
    void setUp(){
        unicornHotel = new UnicornHotel(5);
    }

    @Test
    public  void testThatObjectExist(){
        assertNotNull(unicornHotel);
    }

    @Test
    public void testThatCanBookRoom(){
        String name;
        assertEquals("kabir",unicornHotel.bookRoom("kabir"));
        assertEquals("kabir", unicornHotel.getRoomGuest(1));
        assertEquals("Yusuf",unicornHotel.bookRoom("Yusuf"));
        assertEquals("Yusuf", unicornHotel.getRoomGuest(2));
    }

    @Test
    public void  testToKnowRoomGuest(){
        String name = "Yusuf";
        assertEquals(name,unicornHotel.bookRoom("Yusuf"));
        assertEquals("Yusuf", unicornHotel.getRoomGuest(2));
    }

    @Test
    public void testToKnowAvailableRooms(){
        assertEquals("kabir", unicornHotel.bookRoom("kabir"));
        assertEquals("Yusuf", unicornHotel.bookRoom("Yusuf"));
        assertEquals("Ade", unicornHotel.bookRoom("Ade"));
        unicornHotel.getAvailableRooms();
    }

    @Test
    public void testToCheckOut(){

    }


}


