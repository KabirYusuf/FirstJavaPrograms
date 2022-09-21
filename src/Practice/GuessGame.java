package practice;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Guess your number: ");
        int number = input.nextInt();
        if (number == 50) {
            System.out.print("You're lucky");
        } else if (number < 50) {
            System.out.print("Too Less");
        } else if (number > 50) {
            System.out.print("Too Much");
        }
    }
}

