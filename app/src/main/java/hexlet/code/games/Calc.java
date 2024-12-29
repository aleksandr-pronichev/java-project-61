package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_NUMBER = 100;

    public static void gameCalc() {
        String[][] questionsAndAnswers = generateData();
        Engine.game(RULES, questionsAndAnswers);
    }

    public static String[][] generateData() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        String[] operators = {"+", "-", "*"};

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = (int) (Math.random() * MAX_NUMBER);
            int secondNumber = (int) (Math.random() * MAX_NUMBER);
            String operator = operators[(int) (Math.random() * operators.length)];
            String question = firstNumber + " " + operator + " " + secondNumber;

            String correctAnswer = "";
            switch (operator) {
                case "+":
                    correctAnswer = Integer.toString(firstNumber + secondNumber);
                    break;
                case "-":
                    correctAnswer = Integer.toString(firstNumber - secondNumber);
                    break;
                case "*":
                    correctAnswer = Integer.toString(firstNumber * secondNumber);
                    break;
                default:
                    break;
            }

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        return questionsAndAnswers;
    }
}

