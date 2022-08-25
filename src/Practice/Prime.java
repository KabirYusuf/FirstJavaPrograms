package Practice;

public class Prime {
    public static void main(String[] args) {
        boolean result = isPrimeNumber(3);
        if(result) System.out.println("true");
    }



    public static boolean isPrimeNumber(int number) {
        int total = 0;
        if (number == 1) {}
        else {
            for (int i = number; i >= 1; i--) {
                if (number % i == 0) {
                    total++;
                }
            }
            if (total == 2) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

}
