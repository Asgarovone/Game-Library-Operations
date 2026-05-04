package menu;

import menuProcessesOfAdminOperations.MenuProcessOfAddGame;
import menuProcessesOfAdminOperations.MenuProcessOfDeleteGame;
import menuProcessesOfAdminOperations.MenuProcessOfUpdateGame;

import java.util.Scanner;

public class AdminMenu {

    Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("1. Add model.Game");
            System.out.println("2. Update model.Game");
            System.out.println("3. Delete model.Game");
            System.out.println("0. Exit");

            System.out.print("Choice: ");
            int choiceInAdminSection = scanner.nextInt();
            System.out.println();

            if (choiceInAdminSection == 1) {
                MenuProcessOfAddGame menuProcessOfAddGame = new MenuProcessOfAddGame();
                menuProcessOfAddGame.process();
            }
            else if (choiceInAdminSection == 2) {
                MenuProcessOfUpdateGame menuProcessOfUpdateGame = new MenuProcessOfUpdateGame();
                menuProcessOfUpdateGame.process();
            }
            else if (choiceInAdminSection == 3) {
                MenuProcessOfDeleteGame menuProcessOfDeleteGame = new MenuProcessOfDeleteGame();
                menuProcessOfDeleteGame.process();
            }
            else if (choiceInAdminSection == 0) {
                System.out.println("Exiting ...");
                break;
            } else System.out.println("Invalid input !");

        }
    }

}
