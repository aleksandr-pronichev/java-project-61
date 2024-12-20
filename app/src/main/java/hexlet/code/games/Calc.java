package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_NUMBER = 100;

    public static void gameCalc() {
        String[] questions = new String[Engine.ROUNDS];
        String[] correctAnswers = new String[Engine.ROUNDS];
        String[] operators = {"+", "-", "*"};

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = (int) (Math.random() * MAX_NUMBER);
            int secondNumber = (int) (Math.random() * MAX_NUMBER);
            String operator = operators[(int) (Math.random() * operators.length)];
            questions[i] = firstNumber + " " + operator + " " + secondNumber;

            switch (operator) {
                case "+":
                    correctAnswers[i] = Integer.toString(firstNumber + secondNumber);
                    break;
                case "-":
                    correctAnswers[i] = Integer.toString(firstNumber - secondNumber);
                    break;
                case "*":
                    correctAnswers[i] = Integer.toString(firstNumber * secondNumber);
                    break;
                default:
                    break;
            }
        }
        Engine.game(RULES, questions, correctAnswers);
    }
}
