package practice;

public class ArrayMaxAndMinNumber {
    public static void main(String[] args) {
        int [] array = {20,-10,1,50,8,3};
        arrayMaxMinNumber(array);
//        arrayMin(array);
    }

    public static void arrayMaxMinNumber(int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }

            System.out.printf("Max: %d%nMin: %d",array[array.length-1],array[0]);



    }

//    public static void arrayMin(int [] array){
//        int min = 0;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] < min){
//                min = array[i];
//            }
//        }
//        System.out.println(min);
//
//    }
}
