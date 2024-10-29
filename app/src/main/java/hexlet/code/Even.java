package hexlet.code;

import java.util.Scanner;
import java.lang.Math;

public class Even {
    public static void gameEven() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int guessedNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + guessedNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            }
            if (guessedNumber % 2 == 0 && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (guessedNumber % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
            }
            if (guessedNumber % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (guessedNumber % 2 != 0 && answer.equals("no")){
                System.out.println("Correct!");
            }

            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
                break;
            }
        }
        scanner.close();
    }

}
