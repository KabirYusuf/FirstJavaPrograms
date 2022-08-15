package classExercise.SalesPerson;

import java.math.BigDecimal;

public class SalesPerson {
    private Item[] soldItems;
    private final double WEEKLY_PAY = 200;
    private final double COMMISSION_RATE = 0.09;

    public SalesPerson(Item[] soldItems) {
        this.soldItems = soldItems;
    }

    public Item[] getSoldItems() {

        return soldItems;
    }

    public void setSoldItems(Item[] soldItems) {

        this.soldItems = soldItems;
    }

    public double calculateEarnings(){
        double commission = BigDecimal.ZERO.doubleValue();
        for (int i = 0; i < soldItems.length; i++){
            commission += soldItems[i].getValueSold() * COMMISSION_RATE;
        }
        double earnings = WEEKLY_PAY + commission;
        return earnings;
    }

    public String toString(){
        Item item = new Item();
        return String.format("%f%n%.2f",item.getValueSold(), calculateEarnings());
    }

}
