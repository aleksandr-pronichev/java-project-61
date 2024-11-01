package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                Cli.greeting();
            case 2:
                Even.gameEven();
            case 0:
                break;
            default:
                System.out.println("Please select 1, 2, 3, 4, 5, 6 or 0.");
        }

        scanner.close();

    }
}
