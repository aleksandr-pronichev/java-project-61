package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String RULES = "What number is missing in the progression?";

    public static void gameProgression() {
        String[] questions = new String[Engine.ROUNDS];
        String[] correctAnswers = new String[Engine.ROUNDS];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int progressionLength = (int) (Math.random() * 6) + 5;
            int start = (int) (Math.random() * 10);
            int step = (int) (Math.random() * 10) + 1;

            int[] progression = new int[progressionLength];

            for (int j = 0; j < progressionLength; j++) {
                progression[j] = start + j * step;
            }

            int missingIndex = (int) (Math.random() * progressionLength);
            int missingNumber = progression[missingIndex];
            progression[missingIndex] = -1;

            String question = "";
            for (int j = 0; j < progressionLength; j++) {
                if (progression[j] == -1) {
                    question += ".. ";
                } else {
                    question += progression[j] + " ";
                }
            }

            questions[i] = question.trim();
            correctAnswers[i] = Integer.toString(missingNumber);
        }

        Engine.game(RULES, questions, correctAnswers);
    }
}
