import java.util.Scanner;

public class Main {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        insertTestNames();

        do {
            System.out.println();
            displayGuests();
            System.out.println();
            displayMenu();
            int option = getOption();


            if (option == 5) {
                break;
            } else if (option == 1) {
                addGuest();
            } else if (option == 2) {
                insertGuest();
            } else if (option == 3) {
                renameGuest();
            } else if (option == 4) {
                removeGuest();
            }
        } while (true);
        System.out.println("Exiting ...");

    }

    static void displayGuests() {
        System.out.println("______________________________________\n -Guests-\n");
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("guests list is empty");
        }
    }

    static void displayMenu() {
        System.out.println("What do you want to do next? ");
        System.out.println("______________________________________\n -Menu-\n");
        System.out.println("1 - Add guest");
        System.out.println("2 - Insert guest");
        System.out.println("3 - Rename guest");
        System.out.println("4 - Remove guest");
        System.out.println("5 - Exit");
        System.out.println();


    }

    static int getOption() {
        System.out.println("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.println("Name...");
                String name = scanner.nextLine();
                guests[i] = name;
                break;
            }
        }
    }

    static void removeGuest() {
        System.out.println("Number...");
        int number = scanner.nextInt();

        if (guests[number] == null) {
            System.out.println("There is no guest with number" + number);
        } else {
            guests[number - 1] = null;
        }
        String[] temp = new String[guests.length];
        int ti = 0;
        for (int i = 0; i < temp.length; i++) {
            if (guests[i] != null) {
                temp[ti] = guests[i];
                ti++;
            }
        }
    }

    static void insertTestNames() {
        guests[0] = "Jacob";
        guests[1] = "July";
        guests[2] = "Jucy";
        guests[3] = "Jungly";
        guests[4] = "Junior";
    }

    static void renameGuest() {
        System.out.println("Number... ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num >= 1 && num <= 10 && guests[num - 1] != null) {
            System.out.println("Name...");
            String name = scanner.nextLine();
            guests[num - 1] = name;
        } else {
            System.out.println("THere is no guest with that number");
        }
    }

    static void insertGuest() {
        System.out.println("Number... ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num >= 1 && num <= 10 && guests[num - 1] != null) {
            System.out.println("Name...");
            String name = scanner.nextLine();

            for (int i = guests.length - 1; i > num - 1; i--) {
                guests[i] = guests[i-1];
            }
            guests[num - 1] = name;
        } else {
            System.out.println("THere is no guest with that number");
        }
    }
}