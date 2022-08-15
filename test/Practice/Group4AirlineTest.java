package Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Group4AirlineTest {
    Group4Airline group4Airline;

    @BeforeEach
    public void setUp(){
        group4Airline =  new Group4Airline(10);

    }

    @Test
    public  void testThatObjectExist(){
        assertNotNull(group4Airline);
    }

    @Test
    public void testForAvailableSeats(){
        group4Airline.getAvailableSeats();
    }

//    @Test
//    public void testForTheUserInput(){
//        assertEquals(1,group4Airline.userInput(1));
//    }

    @Test
    public void testForBooking(){
        group4Airline.booking(1);
        group4Airline.booking(1);
        group4Airline.booking(2);
        group4Airline.booking(1);




//        group4Airline.booking(2);
//        group4Airline.booking(2);
//        group4Airline.booking(2);
//        group4Airline.booking(2);
//        group4Airline.booking(2);
//        group4Airline.booking(2);

    }
}