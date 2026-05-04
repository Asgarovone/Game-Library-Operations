package menu;

import adminMenu.addGameMenu;
import adminMenu.deleteGameMenu;
import adminMenu.updateGameMenu;

import java.util.Scanner;

public class AdminMenu {

    Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("1. Add Game");
            System.out.println("2. Update Game");
            System.out.println("3. Delete Game");
            System.out.println("0. Exit");

            System.out.print("Choice: ");
            int choiceInAdminSection = scanner.nextInt();
            System.out.println();

            if (choiceInAdminSection == 1) {
                addGameMenu addGameMenu = new addGameMenu();
                addGameMenu.process();
            }
            else if (choiceInAdminSection == 2) {
                updateGameMenu updateGameMenu = new updateGameMenu();
                updateGameMenu.process();
            }
            else if (choiceInAdminSection == 3) {
                deleteGameMenu deleteGameMenu = new deleteGameMenu();
                deleteGameMenu.process();
            }
            else if (choiceInAdminSection == 0) {
                System.out.println("Exiting ...");
                break;
            } else System.out.println("Invalid input !");

        }
    }

}
