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


            if (option == 3) {
                break;
            } else if (option == 1) {
                addGuest();

            } else if (option == 2) {
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
        if (isEmpty){
            System.out.println("guests list is empty");
        }
    }

    static void displayMenu() {
        System.out.println("What do you want to do next? ");
        System.out.println("______________________________________\n -Menu-\n");
        System.out.println("1 - Add guest");
        System.out.println("2 - Remove guest");
        System.out.println("3 - Exit");
        System.out.println();


    }

    static int getOption() {
        System.out.println("Option: ");
        int option = scanner.nextInt();
        return option;
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.println("Name...");
                String name = scanner.next();
                guests[i] = name;
                break;
            }
        }
    }

    static void removeGuest() {
        System.out.println("Name...");
        String name = scanner.next();
        String[] temp = new String[guests.length];
        int ti = 0;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && guests[i].equals(name)) {
                guests[i] = null;
                break;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (guests[i] != null) {
                temp[ti] = guests[i];
                ti++;
            }
        }
    }

    static void insertTestNames(){
        guests[0] = "Jacob";
        guests[1] = "July";
        guests[2] = "Jucy";
        guests[3] = "Jungly";
        guests[4] = "Junior";
    }
}