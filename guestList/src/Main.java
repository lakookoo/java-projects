import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("______________________________________");
            System.out.println("-Menu-");
            System.out.println("1 - Display all guests");
            System.out.println("2 - Add guest");
            System.out.println("3 - Remove guest");
            System.out.println("4 - Exit");
            System.out.println();

            System.out.println("Option: ");

            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("______________________________________");
                System.out.println("-Guests-");
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.println("--");
                    } else {
                        System.out.println(guests[i]);
                    }
                }
            } else if (option == 4) {
                break;
            } else if (option == 2) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.println("Name...");
                        String name = scanner.next();
                        guests[i] = name;
                        break;
                    }
                }

            } else if (option == 3) {
                System.out.println("Name...");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
            }
        } while (true);
        System.out.println("Exiting ...");

    }
}