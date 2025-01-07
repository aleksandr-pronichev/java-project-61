package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String RULES = "What is the result of the expression?";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void gameCalc() {
        String[][] questionsAndAnswers = generateData();
        Engine.game(RULES, questionsAndAnswers);
    }

    public static String[][] generateData() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        char[] operators = {'+', '-', '*'};

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            int secondNumber = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            char operator = operators[(int) (Math.random() * operators.length)];
            String question = firstNumber + " " + operator + " " + secondNumber;
            String correctAnswer = calculate(firstNumber, secondNumber, operator);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        return questionsAndAnswers;
    }

    public static String calculate(int firstNumber, int secondNumber, char operator) {
        switch (operator) {
            case '+':
                return Integer.toString(firstNumber + secondNumber);
            case '-':
                return Integer.toString(firstNumber - secondNumber);
            case '*':
                return Integer.toString(firstNumber * secondNumber);
            default:
                throw new IllegalArgumentException("Unsupported operator");
        }
    }
}

