package practice;

import java.util.Scanner;

public class PredicateMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 if you are a native and any other number if you are not: ");
        int nativeNumber = input.nextInt();
        setNativeNumber(nativeNumber);
        if(isAnative()){
            System.out.println("Enter cohort number: ");
            int cohortNumber = input.nextInt();
            if((cohortNumber == 9) || (cohortNumber == 12)){
                System.out.println("Second floor");
            }
            if((cohortNumber == 10) || (cohortNumber == 11)){
                System.out.println("First floor");
            }
            switch (cohortNumber){
                case 9:
                    System.out.print("Afin");
                    break;
                case 12:
                    System.out.print("Obodo");
                    break;
                case 10:
                    System.out.print("Amina");
                    break;
                case 11:
                    System.out.print("Magaji");
                    break;
                default:
                    System.out.print("Wrong input");
            }

        }
        else{
            System.out.print("You are not a native, stay down floor.");
        }


    }

    private static int nativeNumber;

    public static void setNativeNumber(int nativeNumber) {
        PredicateMethod.nativeNumber = nativeNumber;
    }

    public static int getNativeNumber() {
        return nativeNumber;
    }
    public static boolean isAnative(){
        boolean isNative;
        if(getNativeNumber() == 1){
            isNative = true;
        }
        else {
            isNative = false;
        }
        return isNative;
    }




}
