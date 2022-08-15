package Practice;

import java.security.SecureRandom;

public class Dice {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int [] diceFace = new int[7];

        for (int i = 1; i < 60_000; i++) {
            ++diceFace[1 + secureRandom.nextInt(6)];
        }
        for (int i = 1; i < diceFace.length; i++) {
            System.out.println(diceFace[i]);
        }

    }
}
