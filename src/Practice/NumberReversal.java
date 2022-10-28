package practice;

public class NumberReversal {
    public static void main(String[] args) {
        System.out.println( numberReversal("mom"));
    }

    public static String numberReversal(String number){
        int numberLength = number.length();
        String reversal = "";
        for (int i = numberLength - 1; i >= 0 ; i--) {
            char picNumber = number.charAt(i);
            reversal += picNumber;
        }
        if(number.equals(reversal)){
            System.out.println("is a palindrome");
        }
        else {
            System.out.println("is not a palindrome");
        }
        return reversal;
    }
    public static int numberReversal(int number){
        int numberReverse = 0;
        while (number != 0){
            numberReverse = numberReverse * 10;
            numberReverse += number % 10;
            number = number / 10;
        }
        return numberReverse;
    }
}
