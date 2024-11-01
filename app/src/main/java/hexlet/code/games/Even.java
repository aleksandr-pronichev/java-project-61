package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class Even {
    public static void gameEven() {
        String userName = Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int guessedNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + guessedNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("'" + answer + "'" + "is wrong answer. Answer should be 'yes' or 'no'");
                break;
            }

            if (guessedNumber % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n"
                            + "Let's try again, " + userName + "!");
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                            + "Let's try again, " + userName + "!");
                    break;
                }
            }

            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
                break;
            }
        }
        scanner.close();
    }

}
