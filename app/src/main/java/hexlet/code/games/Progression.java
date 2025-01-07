package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final String RULES = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_START = 10;
    private static final int MAX_STEP = 10;

    public static void gameProgression() {
        String[][] questionsAndAnswers = generateData();
        Engine.game(RULES, questionsAndAnswers);
    }

    public static String[][] generateData() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int progressionLength = Utils.getRandomInt(MIN_LENGTH, MAX_LENGTH + 1);
            int start = Utils.getRandomInt(0, MAX_START);
            int step = Utils.getRandomInt(1, MAX_STEP + 1);

            String[] progression = generateProgression(start, step, progressionLength);

            questionsAndAnswers[i][0] = progression[0];
            questionsAndAnswers[i][1] = progression[1];
        }
        return questionsAndAnswers;
    }

    public static String[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];

        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }

        int missingIndex = Utils.getRandomInt(0, length - 1);
        int missingNumber = progression[missingIndex];

        String[] formattedProgression = new String[length];

        for (int i = 0; i < length; i++) {
            if (i == missingIndex) {
                formattedProgression[i] = "..";
            } else {
                formattedProgression[i] = Integer.toString(progression[i]);
            }
        }
        String question = String.join(" ", formattedProgression);
        return new String[]{question, Integer.toString(missingNumber)};
    }
}
