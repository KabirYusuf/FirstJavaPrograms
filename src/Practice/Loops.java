package Practice;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        pattern4();
    }

    static void pattern1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int number = input.nextInt();
        int row, col;
        for (row = 1; row <= number; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }

    static void pattern2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int number = input.nextInt();
        int row, col, j = number;
        for (row = 1; row <= number; row++) {
            for (col = 1; col <= j; col++) {
                System.out.print(col);
            }
            j--;
            System.out.println();
        }

    }

    static void pattern3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int number = input.nextInt();
        int row, col;
        for (row = 1; row <= number; row++) {
           int highestNoOfColInTheRows = row > 5 ? 2 * 5 - row : row;
           for (col = 1; col <= highestNoOfColInTheRows; col++ ){
               System.out.print("*");
           }
            System.out.println();
        }

    }
    static void pattern4(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int number = input.nextInt();
        int row, col, space;
        for(row = 1; row <= number; row++){
            for(space = 0; space < number-row; space++){
                System.out.print(" ");
            }
            for (col = row; col >= 1; col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int number = input.nextInt();
        int row, col, space, j = number;
        for (row = 1; row <= number; row++) {
            for(space = 1; space < row; space++){
                System.out.print(" ");
            }
            for(col = 1; col <= j; col++) {
                System.out.print(col);
            }
            j--;
            System.out.println();
        }

    }
    static void pattern6(){
        int row;
        int col;
        int n =5;

    }
}
