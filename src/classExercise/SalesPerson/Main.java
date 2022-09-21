package classExercise.salesPerson;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Item [] arrayOfSoldItems = new  Item[3];
        SalesPerson salesPerson = new SalesPerson(arrayOfSoldItems);
        salesPerson.setSoldItems(arrayOfSoldItems);
        for (int i = 0; i < arrayOfSoldItems.length; i++) {

            System.out.print("Enter amount: ");
            double amount = input.nextDouble();
            Item item = new Item(amount);
            arrayOfSoldItems[i] = item;
        }
        System.out.println(Arrays.toString(arrayOfSoldItems));
        System.out.println(salesPerson.calculateEarnings());
//        Item item  = new Item(200);
//        Item item1 = new Item(500);
//        Item item2 = new Item(600);
//
//        Item [] arrayOfSoldItems = new Item[3];
//        arrayOfSoldItems[0] = item;
//        arrayOfSoldItems[1] = item1;
//        arrayOfSoldItems[2] = item2;
//
//
//        SalesPerson salesPerson = new SalesPerson();
//
//        salesPerson.setSoldItems(arrayOfSoldItems);


//        for (int i = 0; i < arrayOfSoldItems.length; i++){
//            System.out.print("Enter amount for item sold: ");
//            int valueSold = input.nextInt();
//
//            item.setValueSold(valueSold);
//            double getValue = item.getValueSold();
//
//          //  itemsStorage[i] = getValue;
//
//            salesPerson.setSoldItems(arrayOfSoldItems);
//            arrayOfSoldItems[i] = item;
//        }
//        System.out.println(Arrays.toString(arrayOfSoldItems));
//
//
//
//
//
//
//
//        double earnings = salesPerson.calculateEarnings();
//        System.out.printf("Earning is = %.2f", earnings);



    }
}
