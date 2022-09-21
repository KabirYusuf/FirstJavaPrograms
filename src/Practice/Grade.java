package practice;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Grade();

    }
    static void Grade(){
        int scoreInput;
        int range;
        for(scoreInput = 1; scoreInput <= 5; scoreInput++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your score: ");
            int score = input.nextInt();
            if((score >= 90) && (score <= 100)){
                range = 90;
            }
            else if((score >= 60) && (score < 90)){
                range = 60;
            }
            else if((score >= 50) && (score < 60)){
                range = 50;
            }
            else if((score >= 40) && (score < 50)){
                range = 40;
            }
            else if((score >= 30) && (score < 40)){
                range = 30;
            }
            else if((score >= 20) && (score < 30)){
                range = 20;
            }
            else {
                range = 0;
            }

            switch (range){
                case 90:
                    System.out.println("You have grade A");
                    break;
                case 60:
                    System.out.println("You have grade B");
                    break;
                case 50:
                    System.out.println("You have grade C");
                    break;
                case 40:
                    System.out.println("You have grade D");
                    break;
                case 30:
                    System.out.println("You have grade E");
                    break;
                case 20:
                    System.out.println("You have grade F");
                    break;
                default:
                    System.out.println("Score out of range");
                    break;

            }
            System.out.println();
        }

    }
}
