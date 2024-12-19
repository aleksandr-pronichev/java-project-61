package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void gamePrime() {
        String[] questions = new String[Engine.ROUNDS];
        String[] correctAnswers = new String[Engine.ROUNDS];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = (int) (Math.random() * 100);
            questions[i] = Integer.toString(number);
            if (isPrime(number)) {
                correctAnswers[i] = "yes";
            } else {
                correctAnswers[i] = "no";
            }
        }

        Engine.game(RULES, questions, correctAnswers);
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
