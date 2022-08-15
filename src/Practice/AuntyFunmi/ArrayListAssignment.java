package Practice.AuntyFunmi;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ArrayListAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> arrayListAssignments = new ArrayList<>();

        System.out.print("Enter Name: ");
        String name = input.nextLine();


        while (!Objects.equals(name,"-1")){

            if(!Objects.equals(name,"-1")){
                arrayListAssignments.add(name);

                System.out.print("Enter Name: ");
                name = input.nextLine();
            }
        }

        for(String print: arrayListAssignments){

            System.out.println(print);
        }

    }
}
