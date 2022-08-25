package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {



    @Test
    public void testToReturnTrueIfNumberIsPrime(){
        assertTrue(Prime.isPrimeNumber(2));
    }

}