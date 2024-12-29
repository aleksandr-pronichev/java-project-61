package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;

    public static void gameGCD() {
        String[][] questionsAndAnswers = generateData();
        Engine.game(RULES, questionsAndAnswers);
    }

    public static String[][] generateData() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = (int) (Math.random() * MAX_NUMBER);
            int secondNumber = (int) (Math.random() * MAX_NUMBER);
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
