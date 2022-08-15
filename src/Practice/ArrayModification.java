package Practice;

public class ArrayModification {
    private static int [] array = new int [6];

    public static void main(String[] args) {
        modify(array);
        System.out.println("Modify array");

    }







    static void modify(int [] array3){
        for (int i = 0; i < array3.length; i++){
            array3[i] = 2 * i;
            System.out.println(array3[i]);
        }



    }
}
