package tddClass;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UnicornOilAndGasTest {

    UnicornOilAndGas fillingStation;
    @BeforeEach
    public void setUp(){
        fillingStation = new UnicornOilAndGas("Yaba");
    }
    @Test
    void testThatObjectExist(){
        assertNotNull(fillingStation);
    }
    @Test
    public void testToSetLiterBought(){
        fillingStation.setLiterBought(2);
        assertEquals(2, fillingStation.getLiterBought());
    }
    @Test
    public void testAmount(){
        fillingStation.setLiterBought(3);
        assertEquals(600, fillingStation.petrolAmount());
    }

    @Test
    public  void testAmountAfterDiscount(){
        fillingStation.setLiterBought(2);
        assertEquals(392, fillingStation.priceAfterDiscount());
    }




}
