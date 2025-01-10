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

            int[] progression = generateProgression(start, step, progressionLength);

            String[] stringProgression = new String[progression.length];
            for (int j = 0; j < progression.length; j++) {
                stringProgression[j] = Integer.toString(progression[j]);
            }

            int missingIndex = Utils.getRandomInt(0, progressionLength - 1);
            String missingNumber = stringProgression[missingIndex];
            stringProgression[missingIndex] = "..";

            String question = String.join(" ", stringProgression);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = missingNumber;
        }
        return questionsAndAnswers;
    }

    public static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];

        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }

        return progression;
    }
}
