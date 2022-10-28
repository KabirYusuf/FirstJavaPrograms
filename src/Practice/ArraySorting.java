package practice;

public class ArraySorting {
    public static void main(String[] args) {
        int [] array = {3,4,6,7,1,9,5,11,15,13,8,2,10,12,14};
        ascendingArray(array);
        decendingArray(array);
        shuffleArray(array);


    }

    public static void decendingArray(int [] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                int temp = 0;
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void ascendingArray(int [] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                int temp = 0;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void shuffleArray(int [] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                int temp = 0;
                if(array[i] == array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }


}
