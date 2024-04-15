import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();

            System.out.println();
            System.out.println("______________________________________\n -Guests-\n");
            for (String guest : guests) {
                System.out.println(guest == null ? "--" : guest);
            }
            System.out.println("What do you want to do next? ");
            System.out.println("______________________________________\n -Menu-\n");
            System.out.println("1 - Add guest");
            System.out.println("2 - Remove guest");
            System.out.println("3 - Exit");
            System.out.println();

            System.out.println("Option: ");

            int option = scanner.nextInt();

           if (option == 3) {
                break;
            } else if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.println("Name...");
                        String name = scanner.next();
                        guests[i] = name;
                        break;
                    }
                }

            } else if (option == 2) {
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