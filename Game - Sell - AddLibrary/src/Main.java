import menu.AdminMenu;
import menu.UserMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. User");
            System.out.println("2. Admin");
            System.out.println("0. Exit");

            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            System.out.println();

            if (choice == 1) {
                UserMenu userMenu = new UserMenu();
                userMenu.menu();
            }
            else if (choice == 2) {
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.menu();
            }
            else if (choice == 0) {
                System.out.println("Exiting ...");
                break;
            }
            else System.out.println("Invalid input !");


        }

    }
}