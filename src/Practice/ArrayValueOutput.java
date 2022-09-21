package practice;

import java.util.Scanner;

public class ArrayValueOutput {
    public static void main(String[] args) {
        arrayPractice2();

    }
    static void arrayPractice1(){
        int counter;
        final int ARRAY_LENGTH = 10;
        int [] array = new int [ARRAY_LENGTH];

        for (counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }
        System.out.printf("%n%s%8s%n", "Index", "value");
        for(counter = 0; counter < array.length; counter++){
            System.out.printf("%n%s%8s%n", counter, array[counter]);

        }
    }
    static void arrayPractice2(){
        Scanner input = new Scanner(System.in);
        int [][] numbers = new int [2][2];
        String [] names = new String[2];
        for(int row = 0; row < names.length; row++){
            System.out.print("Enter Name of student: ");
            names[row] = input.nextLine();
        }
       for(int row = 0; row < numbers.length; row++){
           for (int col = 0; col < numbers.length; col++){
               System.out.print("Enter score for subject"+" "+col+" "+": ");
               numbers[row][col] = input.nextInt();
           }
       }
        System.out.println("Name \t \t \t Sub1");
        for(int row = 0; row < names.length; row++){
            System.out.println(names[row]);
        }
        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers.length; col++){
                System.out.print(numbers[row][col]);
                System.out.print("\t\t\t");
            }
            System.out.println();
        }
    }
}
