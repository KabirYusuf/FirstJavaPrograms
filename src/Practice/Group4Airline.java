package practice;


import java.util.Scanner;

public class Group4Airline {
    private final boolean[] seats;
    private  int totalFirst = 0;
    private int totalEconomy = 0;


    public Group4Airline(int capacity) {
        this.seats = new boolean[capacity];

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Group4Airline group4Airline = new Group4Airline(10);

       int userInput = 0;

       while (userInput != 9){

           System.out.print("Enter 1 for first class and 2 for economy: ");

           userInput = input.nextInt();

           group4Airline.booking(userInput);

       }




    }

    public void getAvailableSeats() {
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.println("SEAT" + " " + (i+1) + " IS AVAILABLE");
            }
            else {
                System.out.println("SEAT" + " " + (i+1) + " IS NOT AVAILABLE");
            }

        }
    }

    public void firstClass(){

        for (int i = 0; i < 5; i++) {

            if (!seats[i]) {
                seats[i] = true;
                System.out.println("You have reserved Seat" + " " + (i + 1) + " in first class");
                totalFirst++;
                if(totalFirst == 5)
                    System.out.println("No seat available for first class\nWould you like to book economy?");
                break;

            }

        }
    }

    public  void  economy(){
        for (int i = 5; i < seats.length; i++) {
            if (!seats[i]) {
                seats[i] = true;
                System.out.println("You have reserved seat" + " " + (i + 1) + " in economy");
                totalEconomy++;
                if(totalEconomy == 5){
                    System.out.println("No seat available for Economy\nWould you like to book First Class?");
                }
                break;
            }
        }

    }
    public void booking(int userInput) {
        switch (userInput) {
            case 1 -> firstClass();
            case 2 -> economy();
            case 9 -> {
            }
            default -> System.out.println("Wrong input");
        }
    }

}

