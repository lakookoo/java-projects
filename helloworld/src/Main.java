import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age ?");
        String age = scanner.next();
        int olderAge = Integer.parseInt(age)*2;
        System.out.format("You lived %s years. In another %s years you will be %d years old ", age, age, olderAge);

        System.out.println("What is your name?");
        int lengthOfName = scanner.next().length();
        System.out.format("Your name has %d letters ", lengthOfName);


    }
}