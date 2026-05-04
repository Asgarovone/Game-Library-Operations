import repo.SellingGames;
import repo.UserLibrary;

import java.util.Scanner;

public class MenuProcessOfShowLibrary {

    Scanner scanner = new Scanner(System.in);

    public void process() {
        while (true) {
            UserLibrary.showLibrary();
            System.out.println();
            System.out.println("1. Add model.Game from Store");
            System.out.println("0. Exit");

            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            System.out.println();

            if (choice == 1) {
                // Satışdakı oyunları göstər, ID seçdirt
                int hasGames = SellingGames.showGames();
                if (hasGames == 1) {
                    System.out.print("Enter model.Game ID to add: ");
                    int gameId = scanner.nextInt();
                    UserLibrary.addToLibrary(gameId);
                }
            } else if (choice == 0) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}
