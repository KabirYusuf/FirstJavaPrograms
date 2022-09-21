package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void testToSetModel(){
        Car honda = new Car("Accord","2017",50_000);
        Car toyota = new Car("Camry", "2010", 70_000);

        honda.setModel("Eod");
        toyota.setModel("Corolla");
        assertEquals("Eod",honda.getModel());
        assertEquals("Corolla", toyota.getModel());
    }

    @Test
    public void testToSetYear(){
        Car honda = new Car("Accord","2017",50_000);
        Car toyota = new Car("Camry", "2010", 70_000);
        honda.setYear("2019");
        toyota.setYear("2020");
        assertEquals("2019", honda.getYear());
        assertEquals("2020", toyota.getYear());
    }
    @Test
    public void testToSetPrice(){
        Car honda = new Car("Accord","2017",50_000);
        Car toyota = new Car("Camry", "2010", 70_000);
        honda.setPrice(120_000);
        toyota.setPrice(300_000);
        assertEquals(120_000,honda.getPrice());
        assertEquals(300_000,toyota.getPrice());
    }

    @Test
    public void testDiscountOnFirstCar(){
        Car honda = new Car("Accord","2017",50_000);
        Car toyota = new Car("Camry", "2010", 70_000);
        honda.setPrice(120_000);
        assertEquals(114_000,honda.priceAfterDiscount());
    }

    @Test
    public void testDiscountOnSecondCar(){
        Car honda = new Car("Accord","2017",50_000);
        Car toyota = new Car("Camry", "2010", 70_000);
        toyota.setPrice(300_000);
        assertEquals(279_000,toyota.priceAfterDiscount());
    }

}
