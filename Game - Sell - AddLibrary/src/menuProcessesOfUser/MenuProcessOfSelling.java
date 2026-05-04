package menuProcessesOfUser;

import repo.SellingGames;
import repo.UserLibrary;

import java.util.Scanner;

public class MenuProcessOfSelling {

    Scanner scanner = new Scanner(System.in);

    public void process() {
        while (true) {
            int hasGames = SellingGames.showGames();
            System.out.println();

            if (hasGames == 0) {
                break;
            }

            System.out.println("Enter Game ID to buy (0 to Exit): ");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            System.out.println();

            if (choice == 0) {
                System.out.println("Exiting ...");
                break;
            } else {
                UserLibrary.addToLibrary(choice);
            }
        }
    }
}
