package practice;

import org.junit.jupiter.api.Test;

import static practice.Factor.factor;
import static org.junit.jupiter.api.Assertions.*;

class FactorTest {

    @Test
    public void testToReturnTotalNumberOfFactorANumberHas(){
        assertEquals(4, factor(6));
    }

}