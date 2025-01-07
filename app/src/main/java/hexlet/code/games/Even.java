package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void gameEven() {
        String[][] questionsAndAnswers = generateData();
        Engine.game(RULES, questionsAndAnswers);
    }

    public static String[][] generateData() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            String question = Integer.toString(number);
            String correctAnswer = isEven(number);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        return questionsAndAnswers;
    }

    public static String isEven(int number) {
        return (number % 2 == 0) ? "yes" : "no";
    }
}

