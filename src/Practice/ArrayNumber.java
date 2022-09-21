package practice;

import java.security.SecureRandom;

public class ArrayNumber {
    private static String name = "bola";
    public static void main(String[] args) {
        //method1();
        //method2();

        test3();
    }
    static void method1(){
        int total = 0;
        int [] numbers = {2,4,5,6,7};
        for (int number : numbers) {
            total += number;
        }
        System.out.println(total);
    }
    static void method2(){
        int total = 0;
        int [] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = 1;
        numbers[3] = 2;
        numbers[4] = 7;
        for (int number : numbers) {
            total += number;
        }
        System.out.println(total);
    }

   static void test() {

       int x = -2;
       int total = 0;

       while (x <= 10) {
           int y = x + 2;
           x++;
           total += y;
           System.out.printf("Y is: %d and total is %d\n", y, total);

//       int num = 14%12;
//       System.out.println(num);
        }

   }

   static void  test2(){
       SecureRandom secureRandom = new SecureRandom();


       for (int i = 0; i < 5; i++) {
           int secure = 3 + secureRandom.nextInt(7);
           System.out.print(secure);
       }
   }

   static void test3(){
       int a = 45 + 2;
       return;
   }



}
