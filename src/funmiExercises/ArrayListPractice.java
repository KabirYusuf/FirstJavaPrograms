package funmiExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int count7 = 0;

        System.out.print("Enter number: ");
        int number = input.nextInt();

        numbers.add(number);

        while(number != -1){
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number != -1){
                numbers.add(number);
            }
        }

        System.out.println(numbers);

        for (int count:numbers) {
            if(count < 0){
                System.out.println(count + " is a negative number");
            }
            else {
                System.out.println(count + " is a positive number");
            }
        }

        for (int count:numbers) {
            if(count == 7) {
                count7++;
            }
        }
        System.out.println(numbers.contains(7));
        System.out.println("Number of 7 is " + count7);


    }
}
