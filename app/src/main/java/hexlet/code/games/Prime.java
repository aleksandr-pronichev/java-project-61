package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    public static void gamePrime() {
        String[][] questionsAndAnswers = generateData();
        Engine.game(RULES, questionsAndAnswers);
    }

    public static String[][] generateData() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            questionsAndAnswers[i][0] = Integer.toString(number);
            if (isPrime(number)) {
                questionsAndAnswers[i][1] = "yes";
            } else {
                questionsAndAnswers[i][1] = "no";
            }
        }
        return questionsAndAnswers;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
