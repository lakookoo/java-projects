import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students took the exam?");
        int numOfStudents = scanner.nextInt();
        System.out.println("What is the maximum possible score can be achieved for this exam?");
        int maxScore = scanner.nextInt();
        int[] scores = new int[numOfStudents];
        for(int i = 0; i < scores.length; i++){
            System.out.format("Please give a score fur a student number %d ", i + 1);
            scores[i] = scanner.nextInt();

        }
        System.out.println("_____Statistics____");
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            double studentScore = scores[i];
            double studentPercentage = ((double) scores[i]/ maxScore) * 100;
            System.out.println("Student" + (i + 1) + ": " + studentScore + "/" + maxScore + " (" + studentPercentage + "%)");
            sum += (int) studentScore;
        }
        double average = (double)sum / scores.length;
        double averagePercentage = (average/ maxScore)*100;
        System.out.println("Average: " + average + "/" + maxScore + " (" + averagePercentage + "%)");

    }
}