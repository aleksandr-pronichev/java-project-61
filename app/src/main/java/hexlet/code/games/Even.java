package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void gameEven() {
        String[] questions = new String[Engine.ROUNDS];
        String[] correctAnswers = new String[Engine.ROUNDS];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = (int) (Math.random() * 100);
            questions[i] = Integer.toString(number);
            if (number % 2 == 0) {
                correctAnswers[i] = "yes";
            } else {
                correctAnswers[i] = "no";
            }
        }
        Engine.game(RULES, questions, correctAnswers);
    }
}
