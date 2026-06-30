import java.util.Scanner;

public class ques120 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of questions for the quiz bank: ");
        int maxQuestions = scanner.nextInt();
        scanner.nextLine();

        String[] questions = new String[maxQuestions];
        String[][] options = new String[maxQuestions][4];
        char[] correctAnswers = new char[maxQuestions];
        int questionCount = 0;

        while (true) {
            System.out.println("\n--- Mini Quiz Management System ---");
            System.out.println("1. Add a Question");
            System.out.println("2. View All Questions");
            System.out.println("3. Play Quiz");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (questionCount < maxQuestions) {
                    questionCount = addQuestion(scanner, questions, options, correctAnswers, questionCount);
                } else {
                    System.out.println("Quiz bank is full! Cannot add more questions.");
                }
            } else if (choice == 2) {
                viewQuestions(questions, options, correctAnswers, questionCount);
            } else if (choice == 3) {
                playQuiz(scanner, questions, options, correctAnswers, questionCount);
            } else if (choice == 4) {
                System.out.println("Exiting the system. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }

    public static int addQuestion(Scanner scanner, String[] questions, String[][] options, char[] correctAnswers, int count) {
        System.out.print("Enter the question: ");
        questions[count] = scanner.nextLine();

        System.out.print("Enter Option A: ");
        options[count][0] = scanner.nextLine();

        System.out.print("Enter Option B: ");
        options[count][1] = scanner.nextLine();

        System.out.print("Enter Option C: ");
        options[count][2] = scanner.nextLine();

        System.out.print("Enter Option D: ");
        options[count][3] = scanner.nextLine();

        System.out.print("Enter the correct option letter (A, B, C, or D): ");
        correctAnswers[count] = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();

        System.out.println("Question added successfully!");
        return count + 1;
    }

    public static void viewQuestions(String[] questions, String[][] options, char[] correctAnswers, int count) {
        if (count == 0) {
            System.out.println("No questions available in the quiz bank.");
            return;
        }

        System.out.println("\n--- Quiz Question Bank ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            System.out.println("  A. " + options[i][0]);
            System.out.println("  B. " + options[i][1]);
            System.out.println("  C. " + options[i][2]);
            System.out.println("  D. " + options[i][3]);
            System.out.println("Correct Answer: " + correctAnswers[i]);
            System.out.println("-----------------------------------");
        }
    }

    public static void playQuiz(Scanner scanner, String[] questions, String[][] options, char[] correctAnswers, int count) {
        if (count == 0) {
            System.out.println("The quiz cannot start because there are no questions available.");
            return;
        }

        int score = 0;
        System.out.println("\n--- Starting the Quiz ---");

        for (int i = 0; i < count; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.println("A. " + options[i][0]);
            System.out.println("B. " + options[i][1]);
            System.out.println("C. " + options[i][2]);
            System.out.println("D. " + options[i][3]);
            System.out.print("Your answer: ");
            
            char userAnswer = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + correctAnswers[i]);
            }
        }

        System.out.println("\n--- Quiz Finished ---");
        System.out.println("Your Final Score: " + score + "/" + count);
    }
}