package classExercise;

import java.util.Objects;

public class ComparingArrayElement {

    public static void main(String[] args) {
        String [] array1 = {"Ade","James","Yusuf"};
        String [] array2 = {"Ade","James","Yusuf"};

        boolean result = compareArrayElement(array1,array2);
        if(result) System.out.println("They are equal");
        else {
            System.out.println("They are not equal");
        }
    }



    public static boolean  compareArrayElement(String [] array1,String [] array2 ){
        boolean lengthValidation = false;
        boolean wordComparism = true;

        if(array1.length == array2.length){
            lengthValidation = true;
        }
            for (int i = 0; i < array1.length; i++) {

                if (!Objects.equals(array1[i], array2[i])){
                    wordComparism = false;
                    break;
                }
            }
        return lengthValidation && wordComparism;
    }
}
