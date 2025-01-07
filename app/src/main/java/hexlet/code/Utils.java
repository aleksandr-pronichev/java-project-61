package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int minNumber, int maxNumber) {
        Random random = new Random();
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        return randomNumber;
    }
}
