package practice;

import java.security.SecureRandom;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] array = {7,2,4,3,6,60,};
        //sortedArray(array);
        System.out.println();
        sortedArrayRandom(array);
    }





        public static void sortedArray(int [] array){



            for(int i = 0; i < array.length; i++){
                for(int j = i + 1; j < array.length; j++){
                    int tempValue;
                    if(array[i] > array[j]){
                        tempValue = array[i];
                        array[i] = array[j];
                        array[j] = tempValue;

                    }

                }


            }
            System.out.print(Arrays.toString(array));

    }


public static void sortedArrayRandom(int [] array){

            SecureRandom secureRandom = new SecureRandom();


            for(int i = 0; i < array.length; i++){
                for(int j = secureRandom.nextInt(5); j < array.length; j++){
                    int tempValue;
                    if(array[i] > array[secureRandom.nextInt(5)]){
                        tempValue = array[i];
                        array[i] = array[j];
                        array[j] = tempValue;
                    }
                }
            }
            System.out.print(Arrays.toString(array));

        }
}
