package menu;

import userMenu.sellingMenu;
import userMenu.showLibraryMenu;

import java.util.Scanner;

public class UserMenu {

    Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("1. Show Selling Games");
            System.out.println("2. Show Library");
            System.out.println("0. Exit");

            System.out.print("Choice: ");
            int choiceInBuyerSection = scanner.nextInt();
            System.out.println();

            if (choiceInBuyerSection == 1) {
                sellingMenu sellingMenu = new sellingMenu();
                sellingMenu.process();
            }
            else if (choiceInBuyerSection == 2) {
                showLibraryMenu showLibraryMenu = new showLibraryMenu();
                showLibraryMenu.process();
            }
            else if (choiceInBuyerSection == 0) {
                System.out.println("Exiting ...");
                break;
            } else System.out.println("Invalid input !");


        }
    }

}
