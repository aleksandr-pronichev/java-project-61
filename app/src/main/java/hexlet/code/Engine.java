package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void game(String rules, String[] questions, String[] correctAnswers) {
        String userName = Cli.greeting();
        System.out.println(rules);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Engine.ROUNDS; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswers[i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
