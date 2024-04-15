import java.util.Scanner;

public class Main {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {




        do {
            System.out.println();
            displayGuests();
            System.out.println();
            displayMenu();
            int option = getOption();


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
        } while (true);
        System.out.println("Exiting ...");

    }

    static void displayGuests(){
        System.out.println("______________________________________\n -Guests-\n");
        for (int i = 0; i < guests.length; i++) {
            System.out.println((i+1)+ ". " + (guests[i] == null ?  ". --" : guests[i] ));
        }
    }

    static void displayMenu(){
        System.out.println("What do you want to do next? ");
        System.out.println("______________________________________\n -Menu-\n");
        System.out.println("1 - Add guest");
        System.out.println("2 - Remove guest");
        System.out.println("3 - Exit");
        System.out.println();


    }

    static int getOption(){
        System.out.println("Option: ");
        int option = scanner.nextInt();
        return option;
    }
}