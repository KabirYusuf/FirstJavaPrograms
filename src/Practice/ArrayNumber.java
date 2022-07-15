package Practice;

public class ArrayNumber {
    public static void main(String[] args) {
        method1();
        method2();
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
}
