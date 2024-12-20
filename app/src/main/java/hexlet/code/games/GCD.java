package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;

    public static void gameGCD() {
        String[] questions = new String[Engine.ROUNDS];
        String[] correctAnswers = new String[Engine.ROUNDS];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = (int) (Math.random() * MAX_NUMBER);
            int secondNumber = (int) (Math.random() * MAX_NUMBER);
            questions[i] = firstNumber + " " + secondNumber;
            int gcd = calculateGCD(firstNumber, secondNumber);
            correctAnswers[i] = Integer.toString(gcd);
        }
        Engine.game(RULES, questions, correctAnswers);
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
