package Practice;

public class Factor {

    public static void main(String[] args) {

        System.out.println(factor(12));

    }

    public static int  factor(int number){
        int total = 0;
        for (int i = number; i > 0 ; i--) {
            if(number % i == 0){
                total += 1;
            }
        }
        return total;
    }
}
