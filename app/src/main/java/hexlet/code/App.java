package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Even.gameEven();
                break;
            case 3:
                Calc.gameCalc();
                break;
            case 4:
                GCD.gameGCD();
                break;
            case 5:
                Progression.gameProgression();
                break;
            case 6:
                Prime.gamePrime();
                break;
            case 0:
                break;
            default:
                System.out.println("Please select 1, 2, 3, 4, 5, 6 or 0.");
        }
        scanner.close();
    }
}
