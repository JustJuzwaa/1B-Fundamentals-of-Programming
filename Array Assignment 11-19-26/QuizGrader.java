public class QuizGrader {
    public static void main(String[] args) {
        char answerKey[] = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};
        char studentAnswers[] = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

        int correctCount = 0;
        
        for (int i = 0; i < answerKey.length; i++) {
            if (answerKey[i] == studentAnswers[i]) {
                correctCount++;
            }
        }

        double scorePercentage = ((double) correctCount / answerKey.length) * 100;
        int score = (int) scorePercentage / 10;

        System.out.println("Student's Grade: " + score + "/10");
        System.out.println("Student's Score: " + scorePercentage + "%");

        if (scorePercentage >= 70) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
