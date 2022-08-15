package Practice;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //highestLowest();
        task2();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int num1 = input.nextInt();
//        System.out.println("Enter first number");
//        int num2 = input.nextInt();
//        System.out.println("Enter first number");
//        int num3 = input.nextInt();
//        System.out.println("Enter first number");
//        int num4 = input.nextInt();
//        System.out.println("Enter first number");
//        int num5 = input.nextInt();
//
//        int minNum = num1;
//        int maxNum = num1;
//
//        if(num2 < minNum) {
//            minNum = num2;
//        }
//        if(num3 < minNum) {
//            minNum = num3;
//        }
//        if(num4 < minNum){
//            minNum = num4;
//        }
//        if (num5 < minNum){
//            minNum = num5;
//        }
//
//
//
//
//        if(num2 > maxNum){
//            maxNum = num2;
//        }
//        if(num3 > maxNum){
//            maxNum = num3;
//        }
//        if(num4 > maxNum){
//            maxNum = num4;
//        }
//        if (num5 > maxNum){
//            maxNum = num5;
//        }
//
//        System.out.printf("min num is: %d max num is: %d", minNum, maxNum);

    }

    public static void highestLowest() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 1 number");
//        int num = input.nextInt();
//        int minNum = num;
//        int maxNum = num;
//        for (int i = 2; i <= 5 ; i++) {
//            System.out.println("Enter" +" "+ i + " "+"number");
//            num = input.nextInt();
//            if(num < minNum){
//                minNum = num;
//            }
//            if(num > maxNum){
//                maxNum = num;
//            }
//
//        }
//        System.out.printf("Minimum number is: %d%n",minNum);
//        System.out.printf("Maximum number is: %d",maxNum);
//
//        System.out.println(minNum);
//        System.out.println(maxNum);
        int count = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  number 1");
        int userInput = input.nextInt();

        int minNum = userInput;
        int maxNum = userInput;

        while (count < 5) {
            System.out.println("Enter number" + " " + (count + 1));
            userInput = input.nextInt();

            boolean userInputIsLager = userInput > maxNum;
            boolean userInputIsLower = userInput < minNum;

            if (userInputIsLager) {
                maxNum = userInput;
            }

            if (userInputIsLower) {
                minNum = userInput;
            }
            count++;
        }

        System.out.printf("Minimum number is: %d%n", minNum);
        System.out.printf("Maximum number is: %d", maxNum);


    }

    public static void task2() {
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("enter number or -1 to end");

        int num = input.nextInt();
        if(num == 1){
            System.out.println(0);
        }

        if(num == 0){
            System.out.println(1);
        }


       while(num != -1){

           System.out.println("enter number or -1 to end");
           num = input.nextInt();
           if(num == 1){
               System.out.println(0);
           }

           if(num == 0){
               System.out.println(1);
           }
       }




    }
}