package Practice;

import java.util.Arrays;

public class ArrayHighestAndLowestSum {

    public static void main(String[] args) {
        int [] array = {2,3,1,5,4};
        //getHighestAddedValue(array);
        ArrayMaxAndMinNumber.arrayMaxMinNumber(getHighestAddedValue(array));
    }


    public static int[] getHighestAddedValue(int [] array){
        int [] totalAddedValue = new int[array.length];
        int total = 0;
        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                total  +=array[j];
            }
            for (int k = 0; k < array.length; k++) {
                totalAddedValue[k] = total - array[k];
             }
            break;
        }
        System.out.println(Arrays.toString(totalAddedValue));
        return totalAddedValue;
    }
}
