package Practice;

import java.util.Scanner;

public class MilesGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        double totalMilesPerGallon = 0;
        double milesPerGallon;
        System.out.print("Enter amount of"+ " "+ counter + " " +" miles: ");
        int miles = input.nextInt();
        System.out.print("Enter amount of"+ " "+ counter + " " +" gallon used: ");
        int gallons = input.nextInt();


        while (miles != -1) {
            milesPerGallon = (double)miles / gallons;
            System.out.printf("The miles per gallon is %.2f", milesPerGallon);
            totalMilesPerGallon += milesPerGallon;
            System.out.printf("%nThe total miles per gallon at this point  is %.2f", totalMilesPerGallon);
            counter++;
            System.out.printf("%nEnter amount of"+ " "+ counter + " " +" miles: ");
            miles = input.nextInt();
            System.out.printf("Enter amount of"+ " "+ counter + " " +" gallon used: ");
            gallons = input.nextInt();
        }

            System.out.printf("%nThe total miles per gallon is %.2f",totalMilesPerGallon);



    }
}
