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

    }
}
