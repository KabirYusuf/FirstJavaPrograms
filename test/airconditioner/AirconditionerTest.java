package airconditioner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    @DisplayName("For AC is ON")
        public void forAcIsOn(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.setOn(true);
        //check
        assertTrue(sony.getOn());
    }

    @Test
    @DisplayName("For AC is OFF")
    public void forAcIsOff(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.setOff(true);
        //check
        assertTrue(sony.getOff());
    }

    @Test
    @DisplayName("For Increase Temperature")
    public void forIncreaseTemperature(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        //check
        assertEquals(30, sony.getTemperature());
    }

    @Test
    @DisplayName("For decrease Temperature")
    public void forDecreaseTemperature(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        //check
        assertEquals(17, sony.getTemperature());
    }

    @Test
    @DisplayName("For decrease Temperature below 16")
    public void forDecreaseTemperatureBelowSixteen(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        sony.decreaseTemperature();
        sony.setTemperatureBelowSixteen();
        //check
        assertEquals(16, sony.getTemperature());
    }
    @Test
    @DisplayName("For increase Temperature beyond 30")
    public void forIncreaseTemperatureBeyondThirty(){
        //given that
        AirConditioner sony = new AirConditioner();
        //when
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.setTemperatureBeyondThirty();
        //check
        assertEquals( 30,sony.getTemperature());
    }
}