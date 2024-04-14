import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] questions = new String[] {
                    "The moon is further away from the earth than the sun is",
                    "Goldfish only have a three second memory",
                    "Microwaves have a longer wavelength than ultraviolet",
                    "Antibiotics are used to treat viral infections",
                    "Octopuses have three hearts"
        };
        boolean[] answers = new boolean[] {
                    false,
                    false,
                    true,
                    false,
                    true

        };
        boolean[] userAnswers = new boolean[5];
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < questions.length; i ++){
            System.out.println("\n question n " + (i + 1) + " :" + questions[i] + ". True oder false?");
            System.out.println("Your answer: ");
            userAnswers[i] = scanner.nextBoolean();
            if(userAnswers[i] == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("It is wrong");
            }
        }
        System.out.println("\nYour final score is " + score + " out of 5.");
    }
}