package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    public static void gameGCD() {
        String[][] questionsAndAnswers = generateData();
        Engine.game(RULES, questionsAndAnswers);
    }

    public static String[][] generateData() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            int secondNumber = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            String question = firstNumber + " " + secondNumber;

            int gcd = calculateGCD(firstNumber, secondNumber);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = Integer.toString(gcd);
        }
        return questionsAndAnswers;
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
